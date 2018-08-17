package com.example.duodatabases.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.example.duodatabases.common.DynamicDataSource;
import com.example.duodatabases.contast.DataBaseType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author yuanpeng.song
 * @create 2018/8/16
 * @since 1.0.0
 */
@Configuration
public class DataBaseSourceConfig {

    @Autowired
    private Environment env;

    /**
     * 创建数据源(数据源的名称：方法名可以取为XXXDataSource(),XXX为数据库名称,该名称也就是数据源的名称)
     */
    @Bean
    public DataSource financeDataSource() throws Exception {
        Properties props = new Properties();
        props.put("driverClassName", env.getProperty("jdbc.driverClassName"));
        props.put("url", env.getProperty("db1.dbUrl"));
        props.put("username", env.getProperty("db1.username"));
        props.put("password", env.getProperty("db1.password"));
        return DruidDataSourceFactory.createDataSource(props);
    }

    @Bean
    public DataSource asstesDataSource() throws Exception {
        Properties props = new Properties();
        props.put("driverClassName", env.getProperty("jdbc.driverClassName"));
        props.put("url", env.getProperty("db2.dbUrl"));
        props.put("username", env.getProperty("db2.username"));
        props.put("password", env.getProperty("db2.password"));
        return DruidDataSourceFactory.createDataSource(props);
    }

    /**
     * @Primary 该注解表示在同一个接口有多个实现类可以注入的时候，默认选择哪一个，而不是让@autowire注解报错
     * @Qualifier 根据名称进行注入，通常是在具有相同的多个类型的实例的一个注入（例如有多个DataSource类型的实例）
     */
    @Bean
    @Primary
    public DynamicDataSource dataSource(@Qualifier("financeDataSource") DataSource financeDataSource,
                                        @Qualifier("asstesDataSource") DataSource asstesDataSource) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DataBaseType.dataBase_001, financeDataSource);
        targetDataSources.put(DataBaseType.dataBase_002, asstesDataSource);

        DynamicDataSource dataSource = new DynamicDataSource();
        dataSource.setTargetDataSources(targetDataSources);// 该方法是AbstractRoutingDataSource的方法
        dataSource.setDefaultTargetDataSource(financeDataSource);// 默认的datasource设置为myTestDbDataSource

        return dataSource;
    }

    /**
     * 根据数据源创建SqlSessionFactory
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DynamicDataSource ds) throws Exception {
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        fb.setDataSource(ds);
        // 指定数据源(这个必须有，否则报错)
        // 下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
        // 指定基包
        fb.setTypeAliasesPackage("com.example.duodatabases.model");
        fb.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*.xml"));
        return fb.getObject();
    }

    /**
     * 配置事务管理器
     */
    @Bean
    public DataSourceTransactionManager transactionManager(DynamicDataSource dataSource) throws Exception {
        return new DataSourceTransactionManager(dataSource);
    }
}


/**
 * 通过读取application.properties文件生成两个数据源（myTestDbDataSource、myTestDb2DataSource）
 * 使用以上生成的两个数据源构造动态数据源dataSource
 *
 * @Primary：指定在同一个接口有多个实现类可以注入的时候，默认选择哪一个，而不是让@Autowire注解报错（一般用于多数据源的情况下）
 * @Qualifier：指定名称的注入，当一个接口有多个实现类的时候使用（在本例中，有两个DataSource类型的实例，需要指定名称注入）
 * @Bean：生成的bean实例的名称是方法名（例如上边的@Qualifier注解中使用的名称是前边两个数据源的方法名，而这两个数据源也是使用@Bean注解进行注入的）
 *
 * 通过动态数据源构造SqlSessionFactory和事务管理器（如果不需要事务，后者可以去掉）
 */


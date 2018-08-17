package com.example.duodatabases;

import com.example.duodatabases.dao.FirstDemoDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yuanpeng.song
 * @create 2018/8/16
 * @since 1.0.0
 */
public class Test001 extends BaseTest{

    @Autowired
    FirstDemoDao dao;

    @Test
    public void test_001(){
        dao.test_001();
    }
}
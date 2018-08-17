package com.example.duodatabases.dao;

import com.example.duodatabases.mapper.AssetImagePoMapper;
import com.example.duodatabases.mapper.AssetsPhasePoMapper;
import com.example.duodatabases.model.AssetImagePo;
import com.example.duodatabases.service.AssetService;
import com.example.duodatabases.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author yuanpeng.song
 * @create 2018/8/16
 * @since 1.0.0
 */
@Repository
public class FirstDemoDao {

    @Autowired
    private AssetImagePoMapper assetImagePoMapper;
    @Autowired
    private AssetsPhasePoMapper assetsPhasePoMapper;

    @Autowired
    FinanceService financeService;
    @Autowired
    AssetService assetService;

    /**
     * ceshi
     *
     */
    public void test(){
//        DataBaseContextHolder.setDatabaseType(DataBaseType.dataBase_002);
        AssetImagePo po = assetImagePoMapper.selectByPrimaryKey(3668L);
        System.out.println(po.getAssetId());
//        DataBaseContextHolder.setDatabaseType(DataBaseType.dataBase_001);
        System.out.println(assetsPhasePoMapper.selectByPrimaryKey(7L).getLoanId());
    }

    public void test_001(){
        System.out.println(assetService.getAssetImage(3668L).getAssetId());
        System.out.println(financeService.getAssetPhase(7L).getLoanId());
    }

}
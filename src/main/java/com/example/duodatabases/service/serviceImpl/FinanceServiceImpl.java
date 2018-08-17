package com.example.duodatabases.service.serviceImpl;

import com.example.duodatabases.mapper.AssetsPhasePoMapper;
import com.example.duodatabases.model.AssetsPhasePo;
import com.example.duodatabases.service.FinanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuanpeng.song
 * @create 2018/8/17
 * @since 1.0.0
 */
@Service
@Slf4j
public class FinanceServiceImpl implements FinanceService {

    @Autowired
    AssetsPhasePoMapper assetsPhasePoMapper;


    @Override
    public AssetsPhasePo getAssetPhase(Long id) {
        log.info("****************FinanceServiceImpl***********************");
        return assetsPhasePoMapper.selectByPrimaryKey(id);
    }
}
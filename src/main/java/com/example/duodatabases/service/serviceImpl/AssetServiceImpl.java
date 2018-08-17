package com.example.duodatabases.service.serviceImpl;

import com.example.duodatabases.mapper.AssetImagePoMapper;
import com.example.duodatabases.model.AssetImagePo;
import com.example.duodatabases.service.AssetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuanpeng.song
 * @create 2018/8/17
 * @since 1.0.0
 */
@Slf4j
@Service
public class AssetServiceImpl implements AssetService {


    @Autowired
    AssetImagePoMapper assetImagePoMapper;

    @Override
    public AssetImagePo getAssetImage(Long id) {
        log.info("*********************AssetServiceImpl**********************88");
        return assetImagePoMapper.selectByPrimaryKey(id);
    }
}
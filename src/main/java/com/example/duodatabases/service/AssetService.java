package com.example.duodatabases.service;

import com.example.duodatabases.model.AssetImagePo;

/**
 * @author yuanpeng.song
 * @create 2018/8/17
 * @since 1.0.0
 */
public interface AssetService {
    AssetImagePo getAssetImage(Long id);
}
package com.example.duodatabases.mapper;

import com.example.duodatabases.model.AssetImagePo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AssetImagePoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AssetImagePo record);

    int insertSelective(AssetImagePo record);

    AssetImagePo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AssetImagePo record);

    int updateByPrimaryKey(AssetImagePo record);
}
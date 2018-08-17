package com.example.duodatabases.mapper;

import com.example.duodatabases.model.AssetsPhasePo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AssetsPhasePoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AssetsPhasePo record);

    int insertSelective(AssetsPhasePo record);

    AssetsPhasePo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AssetsPhasePo record);

    int updateByPrimaryKey(AssetsPhasePo record);
}
package com.factorymanagement.mapper;

import com.factorymanagement.vo.WarehousingVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WarehousingMapper {
    public void insertGoods(WarehousingVO vo);
    public Integer duplicateGoods(String goods);
}

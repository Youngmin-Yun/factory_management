package com.factorymanagement.mapper;

import java.util.List;

import com.factorymanagement.vo.InventoryVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InventoryMapper {
    public List<InventoryVO> allItems(String item);
}

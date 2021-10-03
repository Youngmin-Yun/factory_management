package com.factorymanagement.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReleaseMapper {
    public void changeInfo(Integer amount, String goods);   
    public Integer goodsAmount(String goods);
    public void deleteItem();
}

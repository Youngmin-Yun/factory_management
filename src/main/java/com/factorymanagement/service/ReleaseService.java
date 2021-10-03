package com.factorymanagement.service;

import com.factorymanagement.mapper.ReleaseMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseService {
    @Autowired
    ReleaseMapper mapper;
    public void changeInfo(Integer amount, String goods){
        mapper.changeInfo(amount, goods);
    }
    public Integer goodsAmount(String goods){
        return mapper.goodsAmount(goods);
    }
    public void deleteItem(){
        mapper.deleteItem();
    }
}

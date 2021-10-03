package com.factorymanagement.service;

import java.util.Date;

import com.factorymanagement.mapper.CategoryMapper;
import com.factorymanagement.mapper.WarehousingMapper;
import com.factorymanagement.vo.WarehousingVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class WarehousingService {
    @Autowired
    WarehousingMapper mapper;
    @Autowired
    CategoryMapper cate_mapper;
    public void insertGoods(WarehousingVO vo){
        Date warehousing_date = vo.getWarehousing_date();
        Date today = new Date();
        if(warehousing_date == null){
            vo.setWarehousing_date(today);
        }
        mapper.insertGoods(vo);
    }
    public boolean duplicateGoods(String goods){
        return mapper.duplicateGoods(goods)>0;
    }
}

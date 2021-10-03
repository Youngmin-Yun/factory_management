package com.factorymanagement.service;

import java.util.List;

import com.factorymanagement.mapper.InventoryMapper;
import com.factorymanagement.vo.InventoryVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    @Autowired
    InventoryMapper mapper;
    public List<InventoryVO> allItems(String item){
        return mapper.allItems(item);
    }
}

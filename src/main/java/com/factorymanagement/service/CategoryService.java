package com.factorymanagement.service;

import java.util.List;

import com.factorymanagement.mapper.CategoryMapper;
import com.factorymanagement.vo.CategoryVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    CategoryMapper mapper;
    public void categoryInput(CategoryVO vo){
        mapper.categoryInput(vo);
    }
    public List<CategoryVO> categoryList(){
        return mapper.categoryList();
    }
    public void categoryDelete(Integer seq){
        mapper.categoryDelete(seq);
    }
}

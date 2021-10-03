package com.factorymanagement.mapper;

import java.util.List;

import com.factorymanagement.vo.CategoryVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    public void categoryInput(CategoryVO vo);
    public List<CategoryVO> categoryList();
    public void categoryDelete(Integer seq);
}

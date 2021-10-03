package com.factorymanagement.api;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.factorymanagement.service.CategoryService;
import com.factorymanagement.vo.CategoryVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryAPIController {
    @Autowired
    CategoryService service;
    @PostMapping("/api/category-input")
    public Map<String, Object> insertCategory(@RequestBody CategoryVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        service.categoryInput(vo);
        resultMap.put("message", "저장되었습니다.");
        return resultMap;
    }
    @GetMapping("/api/category-list")
    public Map<String, Object> getCategoryList(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<CategoryVO> list = service.categoryList();
        resultMap.put("list", list);
        return resultMap;
    }
    @DeleteMapping("/api/category-delete")
    public Map<String, Object> deleteCategory(@RequestParam Integer seq){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        service.categoryDelete(seq);
        resultMap.put("message", "삭제되었습니다.");
        return resultMap;
    }
}

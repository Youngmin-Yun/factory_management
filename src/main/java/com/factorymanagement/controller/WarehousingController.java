package com.factorymanagement.controller;

import java.util.List;

import com.factorymanagement.service.CategoryService;
import com.factorymanagement.vo.CategoryVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WarehousingController {
    @Autowired
    CategoryService service;
    @GetMapping("/warehousing")
    public String getWarehousing(Model model){
        List<CategoryVO> list = service.categoryList();
        model.addAttribute("cate", list);
        return "/warehousing";
    }
}

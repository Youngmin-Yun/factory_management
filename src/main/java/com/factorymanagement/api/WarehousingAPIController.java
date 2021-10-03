package com.factorymanagement.api;

import java.util.LinkedHashMap;
import java.util.Map;

import com.factorymanagement.service.WarehousingService;
import com.factorymanagement.vo.WarehousingVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehousingAPIController {
    @Autowired
    WarehousingService service;
    @PostMapping("/api/goods-input")
    public Map<String, Object> insertGoods(@RequestBody @Nullable WarehousingVO vo){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        service.insertGoods(vo);
        resultMap.put("message", "입력되었습니다.");
        return resultMap;
    }
    @GetMapping("/api/duplication-goods")
    public Map<String, Object> checkGoods(@RequestParam String goods){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        if(service.duplicateGoods(goods)){
            service.duplicateGoods(goods);
            resultMap.put("status", false);
            resultMap.put("message", "이미 등록된 상품이 있습니다. 재고를 확인하시겠습니까?");
        }
        else{
            service.duplicateGoods(goods);
            resultMap.put("status", true);
        }
        return resultMap;
    }
}

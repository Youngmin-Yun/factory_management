package com.factorymanagement.api;

import java.util.LinkedHashMap;
import java.util.Map;

import com.factorymanagement.service.ReleaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReleaseAPIController {
    @Autowired
    ReleaseService service;
    @PatchMapping("/api/release-info")
    public Map<String, Object> updateInfo(@RequestParam Integer amount, @RequestParam String goods){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        goods = "%"+goods+"%";
        service.changeInfo(amount, goods);
        resultMap.put("message", "출고되었습니다.");
        return resultMap;
    }
    @GetMapping("/api/release-amount")
    public Map<String, Object> goodsAmount(@RequestParam String goods){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        goods = "%"+goods+"%";
        // resultMap.put("status", false);
        // resultMap.put("message", "재고가 부족합니다.");
        // resultMap.put("status", true);
        // resultMap.put("message", "출고하시겠습니까?");
        Integer cnt = service.goodsAmount(goods);
        resultMap.put("cnt", cnt);
        return resultMap;
    }
    @DeleteMapping("/api/release-delete-item")
    public Map<String, Object> deleteItem(){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        service.deleteItem();
        return resultMap;
    }
}

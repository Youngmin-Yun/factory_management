package com.factorymanagement.api;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.factorymanagement.service.InventoryService;
import com.factorymanagement.vo.InventoryVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryAPIController {
    @Autowired
    InventoryService service;
    @GetMapping("/api/inventory-list")
    public Map<String, Object> getAllItems(@RequestParam @Nullable String item){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        item = "%"+item+"%";
        List<InventoryVO> list = service.allItems(item);
        resultMap.put("list", list);
        return resultMap;
    }
}

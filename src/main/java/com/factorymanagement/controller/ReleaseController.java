package com.factorymanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReleaseController {
    @GetMapping("/release")
    public String getRelease(){
        return "/release";
    }
}
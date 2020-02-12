package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Sub")
public class InfoController {
    @RequestMapping("/Info")
    public Object info() {
        return "Sub Module: Info";
    }
}

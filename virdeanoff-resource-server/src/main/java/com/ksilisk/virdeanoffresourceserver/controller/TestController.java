package com.ksilisk.virdeanoffresourceserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping
    public String get() {
        return "hellow resource server";
    }
}

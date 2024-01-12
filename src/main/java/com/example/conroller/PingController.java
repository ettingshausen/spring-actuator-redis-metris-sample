package com.example.conroller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class PingController {


    @Cacheable(cacheNames = "cache", key = "#root.methodName")
    @GetMapping("/ping")
    public String ping() {
        log.info("pong!");
        return "pong";
    }

    @Cacheable(cacheNames = "Redis", key = "#root.methodName")
    @GetMapping("/hi")
    public String hello() {
        log.info("Hello!");
        return "Hello";
    }
}

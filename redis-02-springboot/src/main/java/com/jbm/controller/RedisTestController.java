package com.jbm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTestController {
    @Autowired
    private RedisTemplate redisTemplate;
    @GetMapping("/redisTest")
    public String testRedis(){
        redisTemplate.opsForValue().set("name","luvy");
        String name = (String)redisTemplate.opsForValue().get("name");
        System.out.println(name);
        return name;
    }
}

package com.cug.server.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: gg
 * @Time: 2021/12/23  10:53
 */
@RestController
@RequestMapping("/register")
public class JsonTest {
    @PostMapping("/test")
    public Object register(@RequestBody JSONObject jsonObject) {
        System.out.println(jsonObject);
        JSONObject jo = new JSONObject();
        jo.put("SUCCESS",111);
        return jo;
    }

}

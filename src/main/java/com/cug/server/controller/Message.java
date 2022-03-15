package com.cug.server.controller;

import com.alibaba.fastjson.JSONObject;
import com.cug.server.util.AccidentProcess;
import com.cug.server.util.SignatureProcess;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: gg
 * @Time: 2021/12/14  21:47
 * 事故信息上传接口，上传各种签名信息，处理后返回Result
 */

@RestController
@RequestMapping("message")
public class Message {
    @PostMapping("/rsu")
    @ResponseBody
    public Object message(@RequestBody JSONObject jsonobject) throws Exception {

        //验签（环签名验证，车公钥验证），返回原文，用于存储和判责
        List<Object> original = SignatureProcess.verify_original(jsonobject);

        Reward.reward(jsonobject);

        return AccidentProcess.judge(jsonobject, original);
    }
}

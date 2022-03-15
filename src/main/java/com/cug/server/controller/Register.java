package com.cug.server.controller;

import com.alibaba.fastjson.JSONObject;
import com.cug.server.service.VehicleServiceImpl;
import com.cug.server.util.DivideGroup;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: gg
 * @Time: 2021/12/14  19:30
 */

@RestController
@RequestMapping("register")
public class Register {

    @Resource
    private VehicleServiceImpl vehicleService;

    final static String conAddress = "This is register contract address.";

    @PostMapping("/vehicle")
    @ResponseBody
    public Object register(@RequestBody JSONObject jsonObject) {

        //1.获得公钥pk
        String pk_v = jsonObject.getString("pk");
        //到合约注册注册
        System.out.println("pk->" + pk_v + ", 已注册到合约->" + conAddress);

        //2.分组后用户信息写入vehicle表，vId、pk、gId写入group表，返回gId/1
        int gId = DivideGroup.getGId(jsonObject);

        //3.检索出vehicles表中此gId内的所有pk，与gId一起打成json
        List<String> pkList= vehicleService.selectPk(gId);

        //4.gId与pk列表返回给车
        JSONObject jo = new JSONObject();
        jo.put("gId",gId);
        jo.put("pks",pkList);
        return  jo;
    }

}

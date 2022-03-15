package com.cug.server.util;

import com.alibaba.fastjson.JSONObject;
import com.cug.server.service.VehicleServiceImpl;
import javax.annotation.Resource;

/**
 * @Author: gg
 * @Time: 2021/12/15  21:28
 * 保险理赔单元，负责找出银行卡账户，提交银行处理
 */
public class InsuranceClaim {
    @Resource
    private static VehicleServiceImpl vehicleService;

    public static boolean claim(JSONObject jsonObject) {

        //jsonObject里应该包含：两VID，事故责任百分比
        int vId1 = jsonObject.getInteger("vId1");
        int vId2 = jsonObject.getInteger("vId2");
        String V1Card = vehicleService.selectDebitCard(vId1);
        String V2Card = vehicleService.selectDebitCard(vId2);
        //理赔操作，省略
        System.out.println("理赔完成，账户列表: "+V1Card+" "+V2Card);
        return true;
    }
}

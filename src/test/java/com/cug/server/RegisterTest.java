package com.cug.server;

import com.alibaba.fastjson.JSONObject;

/**
 * @Author: gg
 * @Time: 2021/12/22  20:45
 */
public class RegisterTest {
    public static void main(String[] args) {
        JSONObject jo = new JSONObject();
        jo.put("vId",777);
        jo.put("pk","AhjJKL7899sd");
        jo.put("uId","6106281996000000");
        jo.put("debitCard","622848000000");
        jo.put("vehicleLicense", "VL123123");
        jo.put("drivingLicense","DL123123");

    }
}

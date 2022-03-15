package com.cug.server.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: gg
 * @Time: 2021/12/22  19:45
 * 奖励发放，传入钱包地址，根据地址激活合约发放Token
 */
public class Reward {
    public static void reward(JSONObject jsonObject) {

        JSONArray accArr = jsonObject.getJSONArray("assist");

        System.out.println("assist数组里的：" + accArr);
        List<String> wallets = new ArrayList<>();
        for( int i = 0 ; i < accArr.size() ; i++) {
            JSONObject tmp = (JSONObject) accArr.getJSONObject(i).get("signData");
            wallets.add(tmp.getString("wallet"));
        }

        for (String wallet:
             wallets) {
            System.out.println("钱包地址：" + wallet + " ，奖励Token代币已划分！");
        }

    }

}

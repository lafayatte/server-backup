package com.cug.server;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.cug.server.controller.Reward;
import com.cug.server.util.SignatureProcess;
import com.cug.server.util.VerifySignature;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * @Author: gg
 * @Time: 2021/12/16  20:03
 */
public class AllTest {
    public static void main(String[] args) throws Exception {
        JSONObject jo = new JSONObject();
        JSONObject s1 = new JSONObject();
        JSONObject s2 = new JSONObject();
        JSONObject s3 = new JSONObject();
        JSONObject s4 = new JSONObject();
        JSONObject s1s = new JSONObject();
        JSONObject s2s = new JSONObject();
        JSONObject s3s = new JSONObject();
        JSONObject s4s = new JSONObject();
        jo.put("aid", 1234);
        jo.put("v1", 666);
        jo.put("v2", 777);

        List<JSONObject> accList = new ArrayList<>();
        List<JSONObject> assList = new ArrayList<>();

        s1s.put("pk","AAA");
        s1s.put("orgObj","{这是V1的原文}");
        s1s.put("sign","这是V1的签名");
        s1.put("signData",s1s);

        s2s.put("pk","BBB");
        s2s.put("orgObj","{这是V2的原文}");
        s2s.put("sign","这是V2的签名");
        s2.put("signData",s2s);

        accList.add(s1);
        accList.add(s2);

        jo.put("accident",accList);

        s3s.put("pk","ABC");
        s3s.put("orgObj","这是环签名1的原文");
        s3s.put("sign","这是环签名1");
        s3s.put("wallet","1号车钱包");
        s3.put("signData",s3s);

        s4s.put("pk","DEF");
        s4s.put("orgObj","这是环签名2的原文");
        s4s.put("sign","这是环签名2");
        s4s.put("wallet","2号车钱包");
        s4.put("signData",s4s);

        assList.add(s3);
        assList.add(s4);

        jo.put("assist",assList);

        System.out.println(jo);
        System.out.println("********************************************************");

        //Reward.reward(jo);

/*        JSONArray accArr = jo.getJSONArray("assist");
        JSONArray ja = new JSONArray();
        for( int i = 0 ; i < accArr.size() ; i++) {
            JSONObject tmp = (JSONObject) accArr.getJSONObject(i).get("signData");
            ja.add(tmp.getString("orgObj"));
        }
        System.out.println(ja);*/

        List<Object> lo = SignatureProcess.verify_original(jo);
        System.out.println(lo);

    }
}

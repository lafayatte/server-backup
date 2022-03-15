package com.cug.server.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


/**
 * @Author: gg
 * @Time: 2021/12/15  20:33
 * 环签名信息的验证。
 * 返回原文信息，List<String>形式
 */
public class VerifyRingSignature {

    public static JSONArray verify(JSONArray assArr) {
        JSONArray ja = new JSONArray();
        for( int i = 0 ; i < assArr.size() ; i++) {
            JSONObject tmp = (JSONObject) assArr.getJSONObject(i).get("signData");
            ja.add(tmp.getString("orgObj"));
            //环签名验证调用
        }

        return ja;

    }

}

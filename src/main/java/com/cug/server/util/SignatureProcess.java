package com.cug.server.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * @Author: gg
 * @Time: 2021/12/15  22:12
 * 传入签名的Map，获得签名内容，包括原文，公钥，签名后内容
 * 将签名内容进行验证，使用VerifyRingSignature，VerifySignature两个类。
 * 返回签名的原文（集合形式）
 */
public class SignatureProcess {
    public static List<Object> verify_original(JSONObject jsonObject) throws Exception {

        //分别提出签名数组
        JSONArray accArr = jsonObject.getJSONArray("assist");
        JSONArray assArr = jsonObject.getJSONArray("accident");

        //分别对签名进行验证，返回原文
        JSONArray signOrg = VerifySignature.verify(accArr);
        JSONArray ringSignOrg = VerifyRingSignature.verify(assArr);

        List<Object> original= new ArrayList<>();
        original.addAll(signOrg);
        original.addAll(ringSignOrg);
        return original;
    }

}

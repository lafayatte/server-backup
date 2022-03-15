package com.cug.server;

import cn.hutool.json.JSONObject;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: gg
 * @Time: 2021/12/15  16:00
 */
public class JsonList {
    public static void main(String[] args) {
        List<String> ls = new LinkedList<>();
        ls.add("key1111111");
        ls.add("key3333333");
        ls.add("key2222222");
        JSONObject jo = new JSONObject();
        jo.putOnce("id","001");
        jo.putOnce("keys",ls);
        System.out.println(jo);
        //{"keys":["key1111111","key3333333","key2222222"],"id":"001"}
    }
}

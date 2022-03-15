package com.cug.server.util;

import cn.hutool.json.JSONObject;

/**
 * @author: gg
 * @Time: 2021/12/14  19:42
 *
 * Input:json对象和key
 * Output:对应的value
 */
public class GetJsonValue{
    public static String get(JSONObject o, String k) {
        return o.getStr(k);
    }
}

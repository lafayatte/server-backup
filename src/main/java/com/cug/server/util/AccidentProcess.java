package com.cug.server.util;

import com.alibaba.fastjson.JSONObject;
import com.cug.server.bean.Accident;
import com.cug.server.service.AccidentServiceImpl;
import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

/**
 * @Author: gg
 * @Time: 2021/12/15  21:00
 *
 * 事故处理单元
 * 从SignatureProcess传入原文列表，即事故信息
 * 判断出事故责任占比后，调用InsuranceClaim类进行理赔，返回理赔结果
 */

public class AccidentProcess {
    @Resource
    private static AccidentServiceImpl accidentService;

    public static JSONObject judge(JSONObject msgObj, List<Object> original) {
        //参数来自SignatureProcess->Message->AccidentProcess
        //事故处理使用ML？？？

        JSONObject res = new JSONObject();
        //res包含ID和责任百分比，形如{"VID1":"0.2","VID2":"0.8"}
        boolean claimRes = InsuranceClaim.claim(res);
        boolean finish;
        if(claimRes){
            res.put("claimResult","SUCCESS");
            finish = true;
        }else{
            res.put("claimResult","FAIL");
            finish = false;
        }

        int aId = msgObj.getInteger("aId");
        int vId1 = msgObj.getInteger("vId1");
        int vId2 = msgObj.getInteger("vId2");
        Timestamp accTime = new Timestamp(msgObj.getLong("accTime"));

        String sensor = original.toString();
        String result = "VID1:0.2,VID2:0.8";
        String image = "/acc/image/" + aId;

        //数据库操作，更新accidents表，
        Accident accNew = new Accident(aId, accTime, sensor, vId1, vId2, result, finish, image);
        accidentService.insertAccident(accNew);

        return res;
    }

}

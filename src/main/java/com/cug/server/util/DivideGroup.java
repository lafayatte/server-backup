package com.cug.server.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cug.server.bean.Vehicle;
import com.cug.server.service.VehicleServiceImpl;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: gg
 * @Time: 2021/12/14  21:10
 * vehicle对象中增加GID字段，并将其写入vehicle表
 * 选择vId,gId,pk加入到group表，用作后面检索出此组的所有pk
 */
public class DivideGroup {
    @Resource
    private static VehicleServiceImpl vehicleService;

    public static int getGId(JSONObject o) {

        //随机分gId
        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(34);
        list.add(35);
        Random random = new Random();
        int gId = list.get(random.nextInt(list.size()));
        //gId与object里的vId,pk,....一起写入表vehicles
        o.put("gId", gId);
        //对象转Bean bean          JO    bean
        Vehicle v= JSON.parseObject(o.toString(), Vehicle.class);

        System.out.println("GID: "+gId);
        System.out.println(v.toString());
/*        //插入vehicle表，返回插入结果0/1
        int insVehicle = vehicleService.insertVehicle(v);

        return insVehicle == 1 ? gId : 0;*/
        return  gId;
    }

}

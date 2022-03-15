package com.cug.server.dao;

import com.cug.server.bean.Vehicle;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: gg
 * @Time: 2021/12/14  21:12
 */

@Mapper
@Repository
public interface VehicleMapper {
    //1.插入数据
    //2.查找同组所有车公钥集合
    //3.根据VID查找debitCard银行卡信息

    int insertVehicle(Vehicle vehicle);
    List<String> selectPk(int gId);
    String selectDebitCard(int vId);

}

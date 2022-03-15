package com.cug.server.service;


import com.cug.server.bean.Vehicle;

import java.util.List;

/**
 * @author: gg
 * @Time: 2021/12/14  21:23
 */

public interface VehicleService {
    int insertVehicle(Vehicle vehicle);
    List<String> selectPk(int gId);
    String selectDebitCard(int vId);


}

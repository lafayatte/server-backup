package com.cug.server.service;

import com.cug.server.dao.VehicleMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author: gg
 * @Time: 2021/12/14  21:23
 */

@Service
public class VehicleServiceImpl implements VehicleService {

    @Resource
    private VehicleMapper vehicleMapper;

    @Override
    public int insertVehicle(com.cug.server.bean.Vehicle vehicle) {
        return vehicleMapper.insertVehicle(vehicle);
    }

    @Override
    public List<String> selectPk(int gId) {
        return vehicleMapper.selectPk(gId);
    }

    @Override
    public String selectDebitCard(int vId) {
        return vehicleMapper.selectDebitCard(vId);
    }


}

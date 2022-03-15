package com.cug.server.service;

import com.cug.server.bean.Server;
import com.cug.server.dao.ServerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: gg
 * @Time: 2021/12/13  15:53
 */

@Service
public class ServerServiceImpl implements ServerService {

    @Resource
    private ServerMapper serverMapper;

    @Override
    public int insertContract(Server server) {
        return serverMapper.insertContract(server);
    }

    @Override
    public int deleteContract(String conName) {
        return serverMapper.deleteContract(conName);
    }

    @Override
    public Server selectContract(String conName) {
        return serverMapper.selectContract(conName);
    }

    @Override
    public int updateContract(Server server) {
        return serverMapper.updateContract(server);
    }

    @Override
    public List<Server> selectAll() {
        return serverMapper.selectAll();
    }
}

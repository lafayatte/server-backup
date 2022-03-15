package com.cug.server.service;

import com.cug.server.bean.Server;
import java.util.List;

/**
 * @Author: gg
 * @Time: 2021/12/13  15:51
 */
public interface ServerService {

    int insertContract(Server server);
    int deleteContract(String conName);
    Server selectContract(String conName);
    int updateContract(Server server);
    List<Server> selectAll();

}

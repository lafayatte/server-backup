package com.cug.server.dao;

import com.cug.server.bean.Server;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: gg
 * @Time: 2021/12/13  11:53
 */

@Mapper
@Repository
public interface ServerMapper{

    int insertContract(Server server);
    int deleteContract(String conName);
    Server selectContract(String conName);
    int updateContract(Server server);
    List<Server> selectAll();

}

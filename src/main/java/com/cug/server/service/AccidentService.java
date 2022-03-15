package com.cug.server.service;


import com.cug.server.bean.Accident;

/**
 * @Author: gg
 * @Time: 2021/12/14  21:23
 */

public interface AccidentService {

    int insertAccident(Accident accident);
    Accident selectAccident(int aId);

}

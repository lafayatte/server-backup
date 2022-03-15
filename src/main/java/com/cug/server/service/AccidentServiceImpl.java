package com.cug.server.service;

import com.cug.server.bean.Accident;
import com.cug.server.dao.AccidentMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @Author: gg
 * @Time: 2021/12/14  21:23
 */

@Service
public class AccidentServiceImpl implements AccidentService {

    @Resource
    private AccidentMapper accidentMapper;

    @Override
    public int insertAccident(Accident accident) {
        return accidentMapper.insertAccident(accident);
    }


    @Override
    public Accident selectAccident(int aId) {
        return accidentMapper.selectAccident(aId);
    }

}

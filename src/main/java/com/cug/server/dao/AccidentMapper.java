package com.cug.server.dao;

import com.cug.server.bean.Accident;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


/**
 * @Author: gg
 * @Time: 2021/12/13  11:53
 * 第一次插入aId,accTime,flag，其余为空
 * 第二次更新最终结果，更新sensor,v1,v2,result,flag=true,image
 * 查找操作，查找出result flag image，供人查看
 */

@Mapper
@Repository
public interface AccidentMapper {

    int insertAccident(Accident accident);
    Accident selectAccident(int aId);

}

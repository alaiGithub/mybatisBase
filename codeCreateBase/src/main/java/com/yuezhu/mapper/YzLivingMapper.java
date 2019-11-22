package com.yuezhu.mapper;

import com.yuezhu.pojo.entity.YzLiving;
import java.util.List;

/**
* Created by Mybatis Generator on 2019/11/21
*/
public interface YzLivingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YzLiving record);

    YzLiving selectByPrimaryKey(Integer id);

    List<YzLiving> selectAll();

    int updateByPrimaryKey(YzLiving record);
}
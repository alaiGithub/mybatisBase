package com.yuezhu.mapper;

import com.yuezhu.pojo.entity.YzExcellent;
import java.util.List;

/**
* Created by Mybatis Generator on 2019/11/21
*/
public interface YzExcellentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YzExcellent record);

    YzExcellent selectByPrimaryKey(Integer id);

    List<YzExcellent> selectAll();

    int updateByPrimaryKey(YzExcellent record);
}
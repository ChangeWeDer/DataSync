package com.sync.demo.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by Admin on 2021/4/7.
 */

@Mapper
@Repository
public interface SyncMapper  {

    //执行sql
    void executeSql(String sql);

    //查询所有id，用作对比不存在的id
    Set<Integer> getListId(String sql);
}

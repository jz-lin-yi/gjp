package com.itheima.gjp.service;

import com.itheima.gjp.domain.ZhangWu;

import java.util.List;

public interface ZhangWuService {
    /**
     * 查询所有
     * */
    List<ZhangWu> findAll();

    /**
     * 按时间段进行查询
     * */
    List<ZhangWu> findByCondition(String start, String end);

    /**
     * 添加账务
     * */
    void add(ZhangWu zhangWu);

    /**
     * 修改账务
     * */
    void update(ZhangWu zhangWu,Integer id);

    /**
     * 删除账务
     * */
    Integer delete(Integer id);

    /**
     * 根据id查询
     * */
    List<ZhangWu> findById(Integer id);
}

package com.itheima.gjp.service.impl;

import com.itheima.gjp.dao.impl.ZhangWuDaoImpl;
import com.itheima.gjp.domain.ZhangWu;
import com.itheima.gjp.service.ZhangWuService;

import java.util.List;

public class ZhangWuServiceImpl implements ZhangWuService {
    ZhangWuDaoImpl zhangWuDao = new ZhangWuDaoImpl();

    @Override
    public List<ZhangWu> findAll() {
        return zhangWuDao.findAll();
    }

    @Override
    public List<ZhangWu> findByCondition(String start, String end) {
        return zhangWuDao.findByCondition(start, end);
    }

    @Override
    public void add(ZhangWu zhangWu) {
        zhangWuDao.add(zhangWu);
    }

    @Override
    public void update(ZhangWu zhangWu, Integer id) {
        zhangWuDao.update(zhangWu, id);
    }

    @Override
    public Integer delete(Integer id) {
        return zhangWuDao.delete(id);
    }

    @Override
    public List<ZhangWu> findById(Integer id) {
        return zhangWuDao.findById(id);
    }
}

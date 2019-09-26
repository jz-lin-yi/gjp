package com.itheima.gjp.dao.impl;

import com.itheima.gjp.dao.ZhangWuDao;
import com.itheima.gjp.domain.ZhangWu;
import com.itheima.gjp.tools.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;

public class ZhangWuDaoImpl implements ZhangWuDao {
    private static JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());


    @Override
    public List<ZhangWu> findAll() {
        String sql = "select * from gjp_zhangwu";
        return template.query(sql, new BeanPropertyRowMapper<>(ZhangWu.class));
    }

    @Override
    public List<ZhangWu> findByCondition(String start, String end) {
        String sql = "select * from gjp_zhangwu where createtime between ? and ?";
        return template.query(sql, new BeanPropertyRowMapper<>(ZhangWu.class),start,end);
    }

    @Override
    public void add(ZhangWu zhangWu) {
        String sql = "insert into gjp_zhangwu (flname, money, zhangHu, createtime, description) VALUES (?,?,?,?,?)";
        template.update(sql,zhangWu.getFlname(),zhangWu.getMoney(),zhangWu.getZhangHu(),zhangWu.getCreatetime(),zhangWu.getDescription());
    }

    @Override
    public void update(ZhangWu zhangWu, Integer id) {
        String sql = "update gjp_zhangwu set flname = ?,money = ?,zhangHu = ?,createtime = ?,description = ? where zwid = ?;";
        template.update(sql, zhangWu.getFlname(), zhangWu.getMoney(), zhangWu.getZhangHu(), zhangWu.getCreatetime(), zhangWu.getDescription(), id);

    }

    @Override
    public Integer delete(Integer id) {

        String sql = "delete from gjp_zhangwu where zwid = ?";
        return template.update(sql, id);
    }

    @Override
    public List<ZhangWu> findById(Integer id) {
        String str = "select * from gjp_zhangwu where zwid = ?";
        return template.query(str, new BeanPropertyRowMapper<>(ZhangWu.class),id);
    }

}

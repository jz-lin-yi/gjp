package com.itheima.gjp.domain;

import java.io.Serializable;
import java.util.Date;

public class ZhangWu implements Serializable {
    private Integer zwid;
    private String flname;
    private Double money;
    private String zhangHu;
    private Date createtime;
    private String description;

    public Integer getZwid() {
        return zwid;
    }

    public void setZwid(Integer zwid) {
        this.zwid = zwid;
    }

    public String getFlname() {
        return flname;
    }

    public void setFlname(String flname) {
        this.flname = flname;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getZhangHu() {
        return zhangHu;
    }

    public void setZhangHu(String zhangHu) {
        this.zhangHu = zhangHu;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  zwid + "\t\t\t" +
                flname + "\t\t\t" + '\'' +
                money + "\t\t\t" +
                zhangHu + "\t\t\t" + '\'' +
                createtime + "\t\t\t" +
                description + '\'';
    }
}

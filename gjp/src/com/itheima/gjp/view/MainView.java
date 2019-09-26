package com.itheima.gjp.view;

import com.itheima.gjp.domain.ZhangWu;
import com.itheima.gjp.service.impl.ZhangWuServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainView {
    static ZhangWuServiceImpl service = new ZhangWuServiceImpl();
    static Scanner sc = new Scanner(System.in);
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    static ZhangWu zw = new ZhangWu();

    public void run() {

        while (true) {
            System.out.println("----------管家婆家庭记账软件----------");
            System.out.println("1.添加账务" + "\t" + "2.编辑账务" + "\t" + "3.删除账务" + "\t" + "4.查询账务" + "\t" + "5.退出系统");
            System.out.println("请输入要操作的功能序号[1-5] : ");
            int i = new Scanner(System.in).nextInt();
            switch (i) {
                case 1:
                    addZW();
                    break;
                case 2:
                    updateZW();
                    break;
                case 3:
                    deleteZW();
                    break;
                case 4:
                    findZW();
                    break;
                case 5:
                    System.out.println("系统退出");
                    return;
                default:
                    System.out.println("没有此功能");
                    break;
            }
        }
    }

    private static void addZW() {
        System.out.print("请输入类别 : ");
        zw.setFlname(sc.next());
        System.out.print("请输入金额 : ");
        zw.setMoney(sc.nextDouble());
        System.out.print("请输入账户 : ");
        zw.setZhangHu(sc.next());
        System.out.print("请输入时间 : ");
        try {
            zw.setCreatetime(sdf.parse(sc.next()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.print("请输入说明 : ");
        zw.setDescription(sc.next());
        service.add(zw);
        System.out.println("添加账务成功");
    }

    private static void updateZW() {
        System.out.print("请输入ID : ");
        int id = sc.nextInt();
        List<ZhangWu> update = service.findById(id);
        if (update != null && update.size() > 0) {
            System.out.print("请输入新类别 : ");
            zw.setFlname(sc.next());
            System.out.print("请输入新金额 : ");
            zw.setMoney(sc.nextDouble());
            System.out.print("请输入新账户 : ");
            zw.setZhangHu(sc.next());
            System.out.print("请输入新时间 : ");
            try {
                zw.setCreatetime(sdf.parse(sc.next()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.print("请输入新说明 : ");
            zw.setDescription(sc.next());
            service.update(zw, id);
            System.out.println("编辑账务成功");
        } else {
            System.out.println("没有此ID账务,编辑失败");
        }
    }

    private static void deleteZW() {
        System.out.print("请输入ID : ");
        int zwid = sc.nextInt();
        Integer delete = service.delete(zwid);
        if (delete != null && delete != 0) {
            System.out.println("删除账务成功");
        } else {
            System.out.println("没有此ID账务,删除失败");
        }
    }

    private static void findZW() {
        System.out.println("1.查询所有" + "\t" + "2.按条件查询");
        int j = new Scanner(System.in).nextInt();
        switch (j) {
            case 1:
                List<ZhangWu> allZhangWus = service.findAll();
                System.out.println("ID" + "\t\t\t" + "类别" + "\t\t\t\t" + "金额" + "\t\t\t\t" + "账户" + "\t\t\t\t" + "时间" + "\t\t\t\t\t\t" + "说明");
                for (ZhangWu zhangWu : allZhangWus) {
                    System.out.println(zhangWu);
                }
                break;
            case 2:
                System.out.println("请输入开始时间(如: 2016-01-01) :");
                String start = sc.next();
                System.out.println("请输入结束时间(如: 2016-01-01) :");
                String end = sc.next();
                List<ZhangWu> zhangWus = service.findByCondition(start, end);
                System.out.println("ID" + "\t\t\t" + "类别" + "\t\t\t\t" + "金额" + "\t\t\t\t" + "账户" + "\t\t\t\t" + "时间" + "\t\t\t\t\t\t" + "说明");
                for (ZhangWu zhangWu : zhangWus) {
                    System.out.println(zhangWu);
                }
                break;
        }
    }
}

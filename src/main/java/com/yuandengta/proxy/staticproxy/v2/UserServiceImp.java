package com.yuandengta.proxy.staticproxy.v2;

/**
 * @Author:Mars
 * @wx:10769582
 */
//真实角色
public class UserServiceImp implements UserService {

        @Override
    public void add() {
        System.out.println("添加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改了一个用户");
    }

    @Override
    public void query() {
        // 添加日志
            System.out.println("查询了一个用户");
    }
    //提需求 每次调用方法时打印日志---》 代理类
}

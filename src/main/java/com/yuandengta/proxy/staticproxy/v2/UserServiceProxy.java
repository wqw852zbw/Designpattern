package com.yuandengta.proxy.staticproxy.v2;

/**
 * @Author:Mars
 * @wx:10769582
 */
public class UserServiceProxy implements UserService {
    //获得真实角色
    private UserServiceImp usi;

    public UserServiceProxy() {
    }

    // spring建议注入的方式

    public void setUsi(UserServiceImp usi) {
        this.usi = usi;
    }

    @Override
    public void add() {
        log("add");
        // 业务方法是真实角色做
        usi.add();
    }

    @Override
    public void delete() {
        log("delete");
        usi.delete();
    }

    @Override
    public void update() {
        log("update");
        usi.update();
    }

    @Override
    public void query() {
        log("query");
        usi.query();
    }
    //日志方法
    public void log(String msg){
        System.out.println("[Debug]-->使用了"+msg+"方法");
    }
    // 没有改变原有代码，扩展了功能
}

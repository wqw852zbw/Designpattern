package com.yuandengta.proxy.staticproxy.v2;

/**
 * @Author:Mars
 * @wx:10769582
 */
public class Client {
    public static void main(String[] args) {

        //直接上代理
        UserServiceImp userServiceImp = new UserServiceImp();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUsi(userServiceImp);
        proxy.delete();
    }
}

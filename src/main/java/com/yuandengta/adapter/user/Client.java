package com.yuandengta.adapter.user;

/**
 * TODO {@link Client}
 *
 * @Author:Mars
 * @wx:10769582
 */
public class Client {
    public static void main(String[] args) {

        // 第三方兼容接口
        ISuppotPortForThird passportForThird = new SuppotPortForThirdAdapter();
        //原来的接口 可用
        passportForThird.loginForRegist("admin", "admin");
        //新增适配的接口 同样可用
        passportForThird.loginForQQ("mars");

    }

}

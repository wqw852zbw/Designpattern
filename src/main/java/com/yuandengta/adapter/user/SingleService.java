package com.yuandengta.adapter.user;

/**
 * TODO {@link SingleService}
 *
 * @Author:Mars
 * @wx:10769582
 */
//   单一的注册登录方式（被适配类Adaptee）
public class SingleService {


    /**
     * 注册方法
     *
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200, "注册成功", new UserInfo());
    }

    /**
     * 登录的方法
     *
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password) {
        return null;
    }


}

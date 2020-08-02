package com.yuandengta.adapter.user;

/**
 * TODO {@link LoginAdapter}
 *
 * @Author:Mars
 * @wx:10769582
 */
/**
 * 登录适配器接口
 */
public interface LoginAdapter {
    // 是否支持的登录方式
    boolean support(Object adapter);
    // 登录
    ResultMsg login(String id, Object adapter);
    // 适配器执行登录方法
}

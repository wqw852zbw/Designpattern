package com.yuandengta.adapter.user;

/**
 * TODO {@link LoginForTelAdapter}
 *
 * @Author:Mars
 * @wx:10769582
 */
/**
 * 手机登录
 */
public class LoginForTelAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return  adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}



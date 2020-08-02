package com.yuandengta.adapter.user;

/**
 * TODO {@link LoginForTokenAdapter}
 *
 * @Author:Mars
 * @wx:10769582
 */
/**
 *  token自动登录
 */
public class LoginForTokenAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }
    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}



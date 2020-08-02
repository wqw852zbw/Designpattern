package com.yuandengta.adapter.user;

/**
 * TODO {@link LoginForQQAdapter}
 *
 * @Author:Mars
 * @wx:10769582
 */
/**
 *  QQ登录
 */
public class LoginForQQAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}



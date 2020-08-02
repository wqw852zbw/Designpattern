package com.yuandengta.adapter.user;

/**
 * TODO {@link LoginForSinaAdapter}
 *
 * @Author:Mars
 * @wx:10769582
 */
/**
 * 新浪微博登录
 */
public class LoginForSinaAdapter implements LoginAdapter {

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}


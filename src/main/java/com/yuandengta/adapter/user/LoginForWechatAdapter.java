package com.yuandengta.adapter.user;

/**
 * TODO {@link LoginForWechatAdapter}
 *
 * @Author:Mars
 * @wx:10769582
 */
/**
 *  微信登录
 */
public class LoginForWechatAdapter  implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }
    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}



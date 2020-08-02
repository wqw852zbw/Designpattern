package com.yuandengta.adapter.user;

/**
 * TODO {@link IPassportForThird}
 *
 * @Author:Mars
 * @wx:10769582
 */
/**
 * Title: IPassportForThird
 * Description: 第三方登录兼容接口
 *
 */
public interface ISuppotPortForThird {
    /**
     * QQ 登录
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);
    /**
     * 微信登录
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);
    /**
     * 记住登录状态后自动登录
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);
    /**
     * 手机号登录
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone, String code);
    /**
     * 注册后自动登录
     * @param username
     * @param passport
     * @return
     */
    ResultMsg loginForRegist(String username, String passport);
}



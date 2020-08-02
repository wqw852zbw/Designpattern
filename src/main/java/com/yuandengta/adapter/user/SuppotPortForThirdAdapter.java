package com.yuandengta.adapter.user;

/**
 * TODO {@link SuppotPortForThirdAdapter}
 *
 * @Author:Mars
 * @wx:10769582
 * 支持最简单的登录方式
 *  还兼容第三方的登录方式
 */
public class SuppotPortForThirdAdapter extends SingleService implements ISuppotPortForThird {

    /**
     *
     * @param id
     * @return ResultMsg
     */
    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    /**
     *
     * @param id
     * @return ResultMsg
     */
    @Override
    public ResultMsg loginForWechat(String id) {
        return processLogin(id, LoginForWechatAdapter.class);
    }

    /**
     *
     * @param token
     * @return ResultMsg
     */
    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);
    }

    /**
     *
     * @param telphone
     * @param code
     * @return ResultMsg
     */
    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone, LoginForTelAdapter.class);
    }

    /**
     *
     * @param username
     * @param passport
     * @return ResultMsg
     */
    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username, null);
        return super.login(username, null);
    }

   //  兼容登录方式
    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz) {
        try {
            LoginAdapter adapter = clazz.newInstance();
             //判断是否是支持的登录方式,登录需要对应的适配器执行登录方法
                if (adapter.support(adapter)) {
                    System.out.println("传入参数是: key"+"; 调用 "+adapter+" 的login方法");
                    return adapter.login(key, adapter);
                } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}


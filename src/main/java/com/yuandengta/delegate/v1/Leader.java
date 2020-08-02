package com.yuandengta.delegate.v1;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO {@link Leader}
 *
 * @Author:Mars
 * @wx:10769582
 */
//leader 委派者   接收任务，任务分发的作用
public class Leader implements  IExcuter {

    private Map<String,IExcuter> targets = new HashMap<String,IExcuter>();
    public Leader() {
        targets.put("加密",new ExcuterA());
        targets.put("登录",new ExcuterB());
    }
    @Override
    public void excute(String command) {
        targets.get(command).excute(command);
    }
}

package com.yuandengta.delegate.v1;

/**
 * TODO {@link ExcuterA}
 *
 * @Author:Mars
 * @wx:10769582
 */
//员工A执行某项命令
    //具体任务角色
public class ExcuterA implements  IExcuter{

    @Override
    public void excute(String command) {
        System.out.println("员工A 开始做"+command+"的工作");
    }
}

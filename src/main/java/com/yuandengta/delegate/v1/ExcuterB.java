package com.yuandengta.delegate.v1;

/**
 * TODO {@link ExcuterB}
 *
 * @Author:Mars
 * @wx:10769582
 */
//员工B执行某项命令
public class ExcuterB implements  IExcuter{
    @Override
    public void excute(String command) {
        System.out.println("员工B 开始做"+command+"的工作");
    }
}

package com.yuandengta.delegate.v1;

/**
 * TODO {@link Boss}
 *
 * @Author:Mars
 * @wx:10769582
 */
// boss  模拟客户执行任务
public class Boss
{
    public static void main(String[] args) {
        //直接找委托者
        Leader leader  = new Leader();
        //看上去好像是我们的项目经理在干活
        //但实际干活的人是普通员工
        //这就是典型，干活是我的，功劳是你的
        leader.excute("登录");
        leader.excute("加密");
    }
}

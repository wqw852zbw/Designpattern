package com.yuandengta.principle.demeter.v2;

/**
 * TODO {@link Client}
 *
 * @Author:Mars
 * @wx:10769582
 */
public class Client {
}
class Computer {
    private void savaData() {
        System.out.println("保存数据。。。");
    }

    private void killProcess() {
        System.out.println("关闭程序。。。");
    }

    private void closeScreen() {
        System.out.println("关闭屏幕。。。");
    }

    private void stopPower() {
        System.out.println("停止供电。。。");
    }

    //关机按钮
    public void shutDown(){
        savaData();
        killProcess();
        closeScreen();
        stopPower();
    }
}

class Person {

    private Computer cp = new Computer();


    //  按 按钮   直接关机了  作为调用者 不关注 服务方的具体细节
    public void closeComputer() {
        cp.shutDown();
    }
}

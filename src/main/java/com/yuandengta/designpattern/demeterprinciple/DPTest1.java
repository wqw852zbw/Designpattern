package com.yuandengta.designpattern.demeterprinciple;

/**
 * @Author:Mars
 * @Description 猿灯塔，做程序员的引导者！
 * @Date 2020/05/12
 * @个人VX:10769582
 * @官网：http://www.yuandengta.com
 */

class Computer1 {
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

    public void shutDown(){
        savaData();
        killProcess();
        closeScreen();
        stopPower();
    }
}

class Person1 {
    private Computer cp = new Computer();

    /**
     * Person 只需要知道关闭方法就行，不需要知道具体操作，容易发生错乱顺序
     */
    public void closeComputer() {
        cp.stopPower();
    }
}

public class DPTest1 {
}

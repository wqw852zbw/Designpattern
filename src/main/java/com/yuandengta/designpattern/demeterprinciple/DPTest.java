package com.yuandengta.designpattern.demeterprinciple;

/**
 * @Author:Mars
 * @Description 猿灯塔，做程序员的引导者！
 * @Date 2020/05/12
 * @个人VX:10769582
 * @官网：http://www.yuandengta.com
 */

class Computer {
    public void savaData() {
        System.out.println("保存数据。。。");
    }

    public void killProcess() {
        System.out.println("关闭程序。。。");
    }

    public void closeScreen() {
        System.out.println("关闭屏幕。。。");
    }

    public void stopPower() {
        System.out.println("停止供电。。。");
    }
}

class Person {
    private Computer cp = new Computer();

    /**
     * Person 只需要知道关闭方法就行，不需要知道具体操作，容易发生错乱顺序
     */
    public void closeComputer() {
        cp.savaData();
        cp.killProcess();
        cp.closeScreen();
        cp.stopPower();
    }
}


public class DPTest {
}

package com.yuandengta.principle.demeter.v1;

/**
 * TODO {@link Client}
 *
 * @Author:Mars
 * @wx:10769582
 */
public class Client {
    public static void main(String[] args) {

    }
}
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
    // 关联
    private Computer cp = new Computer();

    //关电脑
    public void closeComputer() {
        cp.savaData();
        cp.killProcess();

        cp.stopPower();
        cp.closeScreen();
    }
}
/*
  这样写有问题吗？

    关电脑具体的细节谁知道？  电脑知道

    谁在关？   人在关
    逻辑紊乱

    --》 人关注关机电脑细节吗？   不需要关注   按按钮关闭
 */

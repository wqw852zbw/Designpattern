package com.yuandengta.adapter.classadapter;

/**
 * @Author:Mars
 * @wx:10769582
 */
public class Client {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        System.out.println(" === 类适配器模式 ====");
        Phone phone = new Phone();
        phone.getPower(new VoltageAdapter());

    }
}
/*
 小结： 合成复用（组合优于继承原则）
     类适配器 委培了合成复用原则，在系统中尽量的使用关联关系来替代继承关系
 */
package com.yuandengta.adapter.objectadapter;


/**
 * @Author:Mars
 * @wx:10769582
 */
public class Client {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        System.out.println(" === 对象适配器模式 ====");
        Phone phone = new Phone();
        // 继承变 聚合
        phone.getPower(new VoltageAdapter(new Voltage220V()));

    }
}
/*
    对象适配器：
     1. 一个对象适配器 可以把多个不同的适配器适配到同一个目标
     2. 对象适配器 复合 合成复用原则
     3. 可以适配一个适配者的子类，由于适配器与适配者是关联关系，
     根据“里氏替换原则”，适配者的子类也可以通过该适配器进行适配

     两个原本不相干的类/方法/接口  通过适配器来建立联系 或者适配器来兼容这两个类。。
     旧系统的版本更迭  --》 适配器  做部分升级
     创建一些重复使用的类，用于与一些彼此之间没有太多关联的一些类，引入适配器来一起进行工作

 */

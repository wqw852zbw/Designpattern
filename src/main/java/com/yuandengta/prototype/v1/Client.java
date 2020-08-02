package com.yuandengta.prototype.v1;

import java.util.Date;

/**
 * TODO {@link Client}
 *
 * @Author:Mars
 * @wx:10769582
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        //创建原型对象 v1

        Date date = new Date();
        DouYinVedio v1 = new DouYinVedio("刀小刀变身", date);

        System.out.println("v1 ==> "+v1);

        System.out.println("v1的hashcode值 ==>" + v1.hashCode());

        //现在开始以 V1原型对象 克隆 杂版v2

        DouYinVedio v2 = (DouYinVedio)v1.clone();

        System.out.println("v2 ==> "+v2);

        System.out.println("v2的hashcode值 ==>" + v2.hashCode());
        //  克隆出来的对象和原来是一摸一样的，但是确是两个对象

        v2.setName("Clone: 杂牌变身");

        System.out.println(v2);
    }
}

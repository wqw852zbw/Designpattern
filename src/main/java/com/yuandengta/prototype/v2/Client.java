package com.yuandengta.prototype.v2;

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
        DouYinVedio v2 = (DouYinVedio)v1.clone();
        System.out.println("v1 ==> "+v1);
        System.out.println("v2 ==> "+v2);

        System.out.println("变化来了 ==================================");
        // 改变时间
        date.setTime(13213151);
        System.out.println("v1 ==> "+v1);
        System.out.println("v2 ==> "+v2);

    }
}

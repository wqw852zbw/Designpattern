package com.yuandengta.factory.simplefactory.v2;

import java.util.Calendar;

/**
 * TODO {@link Client2}
 *
 * @Author:Mars
 * @wx:10769582
 */
// 简单工厂的应用
public class Client2 {
    public static void main(String[] args) {

        // 原始方法：客户需要依赖具体对象
        // Calendar calendar = new GregorianCalendar();

        // 简单工厂：分离客户和具体对象，客户只依赖抽象
        Calendar calendar = Calendar.getInstance();//面向接口编程
    }
}

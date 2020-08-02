package com.yuandengta.proxy.staticproxy;

/**
 * @Author:Mars
 * @wx:10769582
 */
//房东
public class HouseOwner implements Rent{

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}

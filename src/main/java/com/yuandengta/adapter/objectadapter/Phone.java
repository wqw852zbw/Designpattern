package com.yuandengta.adapter.objectadapter;


/**
 * @Author:Mars
 * @wx:10769582
 */
public class Phone {
    //充电
    public void getPower(IVoltage5V iVoltage5V) {
        if(iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V, 可以充电~~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V, 不能充电~~");
        }
    }
}

package com.yuandengta.adapter.classadapter;

/**
 * @Author:Mars
 * @wx:10769582
 */
//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    //  处理请求  让 200V的电 降至 5V
    @Override
    public int output5V() {
        // TODO Auto-generated method stub
        //获取到220V电压
        int srcV = output220V();
        int dstV = srcV / 44; //转成 5v
        return dstV;
    }
}
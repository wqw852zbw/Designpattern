package com.yuandengta.adapter.objectadapter;


/**
 * @Author:Mars
 * @wx:10769582
 */
//适配器类  实现目标接口
public class VoltageAdapter  implements IVoltage5V {

    // 关联-聚合关系
    private Voltage220V  voltage220V;

    public VoltageAdapter(Voltage220V  voltage220V){
        this.voltage220V = voltage220V;
    }
    @Override
    public int output5V() {

        int dstV = 0;

        if (null != voltage220V){
            //获取220V 电压
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配。。");
            dstV = src/44;
            System.out.println("适配完成，输出的电压为--->" + dstV);
        }

        return dstV;
    }
}
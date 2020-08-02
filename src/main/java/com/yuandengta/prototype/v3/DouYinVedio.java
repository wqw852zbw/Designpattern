package com.yuandengta.prototype.v3;

import java.util.Date;

/**
 * TODO {@link DouYinVedio}
 *
 * @Author:Mars
 * @wx:10769582
 */

public class DouYinVedio implements  Cloneable {

    private String name ;
    private Date publishTime; //发布时间

    @Override
    protected Object clone() throws CloneNotSupportedException {
       Object obj = super.clone();

       // 实现深克隆的方式
        // 除非采用序列化与反序列化  一旦跟我们IO打交道 效率就会降低（拷贝在内存层面效率最高）
       DouYinVedio vedio = (DouYinVedio) obj;
       //将这个对象的属性也进行克隆
       vedio.publishTime = (Date) this.publishTime.clone();
        return obj;
    }

    public DouYinVedio(){

    }

    public DouYinVedio(String name, Date publishTime) {
        this.name = name;
        this.publishTime = publishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    @Override
    public String toString() {
        return "DouYinVedio{" +
                "name='" + name + '\'' +
                ", publishTime=" + publishTime +
                '}';
    }
}

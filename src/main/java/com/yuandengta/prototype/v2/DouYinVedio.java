package com.yuandengta.prototype.v2;

import java.util.Date;

/**
 * TODO {@link DouYinVedio}
 *
 * @Author:Mars
 * @wx:10769582
 */

/**
 * 步骤：
 *    1. 实现 Cloneable接口
 *    2. 重写 clone()方法
 */
public class DouYinVedio implements  Cloneable {

    private String name ;
    private Date publishTime; //发布时间

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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

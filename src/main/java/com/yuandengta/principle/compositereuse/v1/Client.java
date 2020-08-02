package com.yuandengta.principle.compositereuse.v1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author:Mars
 * @wx:10769582
 */
// 需求： 制作一个集合，要求该集合能记录曾经添加过多少个元素。
 class MySet extends HashSet {

    private int count = 0;

    public boolean add(Object obj){
        count++;
        return super.add(obj);
    }

    @Override
    public boolean addAll(Collection c) {
        count += c.size();
        return super.addAll(c);
    }

    public int getCount(){
        return count;
    }
}
public class Client{
    public static void main(String[] args) {
        MySet set = new MySet();

        Set set2 = new HashSet();
        set2.add("Java性能优化权威指南");
        set2.add("架构之美");
        set2.add("一线架构师实践指南");
        set2.add("Thinking in Java");

        set.addAll(set2);
        System.out.println(set.getCount());
    }
}
//  为什么是8 ？   因为addAl重写了  add（）

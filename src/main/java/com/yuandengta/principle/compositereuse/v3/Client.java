package com.yuandengta.principle.compositereuse.v3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author:Mars
 * @wx:10769582
 */
// 需求： 制作一个集合，要求该集合能记录曾经添加过多少个元素。
    // 修改如下：自己重写addAll 不再让count累加c.size(),而是保证addAll一定要用add()
 class MySet extends HashSet {

    private int count = 0;

    public boolean add(Object obj){
        count++;
        return super.add(obj);
    }

    //不依赖脆弱的父类
    @Override
    public boolean addAll(Collection c) {
        boolean bln = false;
       for(Object obj : c){
           //只要集合里有一个元素添加成功，就返回true
           if (add(c)){
               bln = true;
           }
       }
        return bln;
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

/*
    1. JDK更新  HashSet多了入口方法  addOne()  --> m没有重写  始料未及

    2. 重写了 Add()   addAll()  如果在HashSet中有方法依赖于这两个方法呢？

    围绕  JDK变化  --》 HashSet
 */
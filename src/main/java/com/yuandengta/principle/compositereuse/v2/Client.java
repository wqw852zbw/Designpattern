package com.yuandengta.principle.compositereuse.v2;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author:Mars
 * @wx:10769582
 */
// 需求： 制作一个集合，要求该集合能记录曾经添加过多少个元素。
    //针对v1包的问题，addAll会回调add方法，我们修改代码如下：把addAll删除掉，不重写
    //反正父类的addAll本身就会去调add
 class MySet extends HashSet {

    private int count = 0;

    public boolean add(Object obj){
        count++;
        return super.add(obj);
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
  看起来解决了？   还有问题吗？
   问题： 目前的代码必须依赖这样的事实： 就是HashSet的addAll方法必须去回调add方法
 万一JDK版本升级，addAll不在回调add方法了，则在将来的版本中，我们自定义的这个Myset就将被
 “撼动”

   HashMap  jdk1.6  1.7  1.8 --》 entrty    数据+ 链表   数据+ 链表  + 红黑树  node

 */
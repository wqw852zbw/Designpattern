package com.yuandengta.principle.compositereuse.v4;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author:Mars
 * @wx:10769582
 */
// 需求： 制作一个集合，要求该集合能记录曾经添加过多少个元素。
    // 针对V3的两个问题，我们做出改动：
    //改动： 1. MySet 不继承HashSet  让MySet与HashSet发生关联关系(组合)
 class MySet  {

     private Set set = new HashSet();

     private int count = 0;

    //入口只有两个
    public boolean add(Object obj){
        count++;
        return set.add(obj);
    }

    //不依赖脆弱的父类

    public boolean addAll(Collection c) {
          count += c.size();
      return set.addAll(c);
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
        set.add("呼啸山庄");
        System.out.println(set.getCount());
    }
}
/**
 *   完美
 *
 *   疑惑：
 *     1. 难道以后都不用继承了吗？
 *     2. 难道以后都不使用方法重写了吗？
 *
 *   原则： 如果父类作者与子类作者不是同一个人，就别继承
 *          父类作者不知子类重写哪个方法
 *          子类不知未来的父类会加入什么新方法
 *
 *          如果两者是同一个人，那就可以随便去使用继承
 *          我们自己写代码，继承、重写、随便使用
 *
 *          如果我们仅仅只是为了复用代码，而去继承别人的类，难免出现问题
 *
 *
 *
 */

package com.yuandengta.principle.liskovsubstitution;

/**
 * TODO {@link Client}
 *
 * @Author:Mars
 * @wx:10769582
 */

/**
 *   方法重写： 返回类型、方法名 方法参数保持
 *
 *   方法重写的2个依据：
 *     1. 子类重写父类的方法时，子类方法的方法修饰符不能比父类的更严格
 *     2. 子类重写父类的方法时, 子类方法不能抛出比父类更多的异常   假设不成立
 *
 *     为什么【要有这两个依据？  就是为了保证  子类在替换父类对象后，语法不会报错
 *      也是也就是为了保证里氏替换原则
 */
class SuperClass {

    public void  doSomething(){

    }
}

//派生类
class DeriveClass extends SuperClass{

    public void  doSomething() throws   RuntimeException{

    }
}

public class Client {

    public static void main(String[] args) {
        SuperClass sc = new DeriveClass();
        sc.doSomething();   //  父类不会抛异常
    }
//   正常的 一点毛病的没有
}

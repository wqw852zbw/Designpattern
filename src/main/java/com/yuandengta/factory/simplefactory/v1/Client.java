package com.yuandengta.factory.simplefactory.v1;


/**
 * @Author:Mars
 * @Description 猿灯塔，做程序员的引导者！
 * @Date 2020/05/12
 * @个人VX:10769582
 * @官网：http://www.yuandengtcom
 */

//抽象产品
interface Food{
    void eat();
}

//具体产品
class HanBao implements  Food{

    @Override
    public void eat() {
        System.out.println("吃汉堡咯！");
    }
}
//作者
// #########################################################
//用户

public class Client {

    public static void main(String[] args) {
        Food food = new HanBao(); //向上转型
        food.eat();
    }

}
/*
   这样的设计有问题吗？

   这种设计相当脆弱！ 因为 只要作者修改了具体的产品类名，那么客服端代码也要随之改变

   这样的代码 使我们服务器代码与客服端代码是耦合的，违反了依赖倒置原则

   我们要改善： 解耦 无论服务器端代码怎么修改，客服端代码不关注它的变化，也不用动我的客服端代码。

   --》 使用简单工厂模式
 */
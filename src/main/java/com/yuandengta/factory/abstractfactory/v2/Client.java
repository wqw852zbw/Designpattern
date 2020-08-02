package com.yuandengta.factory.abstractfactory.v2;


/**
 * TODO {@link Client}
 *
 * @Author:Mars
 * @wx:10769582
 */
// 针对于工厂方法的问题：当有多个产品等级时(食物、饮料、甜品。。。)，工厂类就会很多
//修改代码如下： 使用抽象工厂设计模式

//抽象产品
interface Food{
    void eat();
}

//具体产品角色
class HanBao implements Food {

    @Override
    public void eat() {
        System.out.println("吃汉堡咯！");
    }
}

class TasteShrimp implements Food {

    @Override
    public void eat() {
        System.out.println("口味虾真好吃");
    }
}
// 添加产品等级
interface Drink{
    public void drink();
}

class Cola implements Drink{

    @Override
    public void drink() {
        System.out.println("可乐好喝。。");
    }
}

class Beer implements Drink{

    @Override
    public void drink() {
        System.out.println("夏天喝啤酒最爽了。。");
    }
}

class XiaoYeFactory implements  Factory{

    @Override
    public Food getFood() {
        return new TasteShrimp();
    }

    @Override
    public Drink getDrink() {
        return new Beer();
    }
}


class KFCFactory implements  Factory{

    @Override
    public Food getFood() {
        return new HanBao();
    }

    @Override
    public Drink getDrink() {
        return new Cola();
    }
}
// 抽象工厂  --》 抽象工厂生产多个产品等级
interface Factory{
    // 本来工厂只生产一个产品等级，现在生产多个产品等级
    public Food getFood();
    public Drink getDrink();

}

class RoastDuck implements  Food{

    @Override
    public void eat() {
        System.out.println("烤鸭吃不腻啊。。");
    }
}

class Fenta implements Drink{

    @Override
    public void drink() {
        System.out.println("芬达越喝越来劲。。");
    }
}
class BeiJingFactory implements  Factory{

    @Override
    public Food getFood() {
        return new RoastDuck();
    }

    @Override
    public Drink getDrink() {
        return new Fenta();
    }
}


// ===================================================
public class Client {
    public static void main(String[] args) {

    }
}

/*
  6工厂变成3工厂

  扩展  业务变化  --》 抽象工厂是否适应业务扩展

  抽象工厂：

      优点：
        1. 依然具备简单工厂和工厂方法的优点
        2. 抽象工厂减少了工厂类，无论有多少的产品等级，工厂就一套

       疑问：  为什么具体产品要这样搭配？
       抽象工厂中，可以生产多个产品，这些产品必须有逻辑关系

      缺点：
     1. 当产品等级发生变化，都要引起所有之前的工厂代码的修改
          违反了"开闭原则"

     结论：
         产品等级比较固定，考虑抽象工厂
         产品等级经常变化  不建议抽象工厂
         产品等级少，建议 工厂方法

 */
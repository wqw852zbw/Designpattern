package com.yuandengta.factory.factorymethod.v1;


/**
 * @Author:Mars
 * @Description 猿灯塔，做程序员的引导者！
 * @Date 2020/05/12
 * @个人VX:10769582
 * @官网：http://www.yuandengta.com
 */
// 针对于之前的问题：简单工厂的缺点做修改
//修改代码如下： 使用工厂方法设计模式

//抽象产品
interface Food {
    void eat();
}

//具体产品角色
class HanBao implements Food {

    @Override
    public void eat() {
        System.out.println("吃汉堡咯！");
    }
}

//产品
class TasteShrimp1 implements Food {

    @Override
    public void eat() {
        System.out.println("口味虾真好吃");
    }
}

//定义食物生产工厂   --》 专门生产食物  --？知不知道具体生产那个具体产品？
interface FoodFactory {
    public Food getFood();
}

//具体产品工厂
class HanBaoFactory implements FoodFactory {

    @Override
    public Food getFood() {
        return new HanBao();
    }
}

class TasteShrimpFactory implements FoodFactory {

    @Override
    public Food getFood() {
        return new TasteShrimp1();
    }
}
//现在开始变化  扩展新产品烧卖
class Sumai implements  Food{

    @Override
    public void eat() {
        System.out.println("我一个气能吃十个烧卖。。。");
    }
}
//具体的烧卖工厂
// 我没动上面的源代码  扩展了产品和产品工厂
class SumaiFactory1 implements FoodFactory{

    @Override
    public Food getFood() {
        return new Sumai();
    }
}
//  =====================================
public class Client {

    public static void main(String[] args) {

        //  不要直接new HanBao() 直接new就与具体类名耦合，作为上层不应该知道下层内容的
        FoodFactory ff = new SumaiFactory1();
        //  调的子类的方法
        Food food = ff.getFood();

        food.eat();

    }
}
/*
    工厂方法
       优点： 1.具有简单工厂的优点 符合开闭
       2.  扩展了新产品，不需要修改作者原来的代码，只是扩展了一个新工厂而已

       疑问/杠点
        客服端依然依赖于具体的工厂类名   要改又会一起改  ---》 高耦合

       规约： 约定大于配置

      工厂的名字，视为接口。作为作者，我们有责任和义务保证工厂的名字是趋向稳定的，
      我们客服端虽然依赖于工厂的具体的类名，但是在 IT业内，基本上工厂的名字大多都比较稳定，
      至少工厂类的名字要比具体的类名字更稳定

      变化： 增加增加产品等级和产品簇



      DI
       缺点
 */






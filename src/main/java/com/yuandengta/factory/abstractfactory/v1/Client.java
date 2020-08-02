package com.yuandengta.factory.abstractfactory.v1;


/**
 * @Author:Mars
 * @Description 猿灯塔，做程序员的引导者！
 * @Date 2020/05/12
 * @个人VX:10769582
 * @官网：http://www.yuandengta.com
 */

// 现在提出业务需求，   多个产品等级
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

class TasteShrimp implements Food {

    @Override
    public void eat() {
        System.out.println("口味虾真好吃");
    }
}

// 添加产品等级
interface Drink {
    public void drink();
}

//新增具体产品
class Cola implements Drink {

    @Override
    public void drink() {
        System.out.println("可乐好喝。。");
    }
}
// 啤酒
class Beer implements Drink {

    @Override
    public void drink() {
        System.out.println("夏天喝啤酒最爽了。。");
    }
}

interface FoodFactory {
    public Food getFood();
}


class HanBaoFactory implements FoodFactory {

    @Override
    public Food getFood() {
        return new HanBao();
    }


}


class TasteShrimpFactory implements FoodFactory {

    @Override
    public Food getFood() {
        return new TasteShrimp();
    }

}

// 饮料工厂
interface DrinkFactory {
    public Drink getDrink();
}

class ColaFactory implements DrinkFactory {

    @Override
    public Drink getDrink() {
        return new Cola();
    }
}

class BeerFactory implements DrinkFactory {

    @Override
    public Drink getDrink() {
        return new Beer();
    }
}

//=+======================================
//用户
public class Client {

    public static void main(String[] args) {


    }
}

/**
 *   工厂方法
 *
 *    这样写有问题没有？
 *    缺点：
 *    1. 每增加一个产品等级   就要增加一个生产产品的工厂(DrinkFactory)以及
 *    具体的产品生产工厂和具体的产品类  这样会 造成 类的爆炸式增长
 *    增加了系统复杂度  增加了开销
 *
 *    2. 一个具体工厂只能创建一个具体产品
 *    3.  设计太过于复杂
 *
 *    --》 抽象工厂
 */

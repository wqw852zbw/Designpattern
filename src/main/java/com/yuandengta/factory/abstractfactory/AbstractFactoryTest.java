package com.yuandengta.factory.abstractfactory;



/**
 * @Author:Mars
 * @Description 猿灯塔，做程序员的引导者！
 * @Date 2020/05/12
 * @个人VX:10769582
 * @官网：http://www.yuandengta.com
 */
// 针对于工厂方法的问题：当有多个产品等级时(食物、饮料、甜品。。。)，工厂类就会很多
    //修改代码如下： 使用抽象工厂设计模式

//抽象产品
interface Food{
    void eat();
}

//具体产品角色
class Fish implements Food {

    @Override
    public void eat() {
        System.out.println("吃鱼咯！");
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


class TanYuFactory implements  Factory{

    @Override
    public Food getFood() {
        return new Fish();
    }

    @Override
    public Drink getDrink() {
        return new Cola();
    }
}
// 抽象工厂
interface Factory{
   public Food getFood();
   public Drink getDrink();
}


public class AbstractFactoryTest {

    public static void main(String[] args) {

    }
}

//解决疑点2添加    架构业务
class Bussiness{
    //品尝食物
    public static void taste(Factory ff){
        Food f = ff.getFood();
        Drink d = ff.getDrink();
        System.out.println("评委1，品尝");
        f.eat();
        d.drink();

        Food f1 = ff.getFood();
        Drink d1 = ff.getDrink();
        System.out.println("评委2，品尝");
        f1.eat();
        d1.drink();
    }
}
/**
 *   抽象工厂
 *
 *   优点：
 *     1. 仍然拥有简单工厂和工厂方法的优点
 *     2. 更重要的时，抽象工厂把工厂类的数量减少了！ 无论有多少个产品等级，工厂就一套
 *
 *
 *     疑问：
 *
 *     为什么夜宵工厂里面，就必须啤酒配口味虾呢？ 不能随意搭配吗？
 *     解释： 抽象工厂中，可以生产多个产品，这多个产品之间必须有逻辑关系
 *
 *     缺点：
 *     1. 当产品等级发生变化时（增加产品等级，删除），都要引起所有以前工厂代码的修改，
 *        违反了"开闭原则"  (影响了其他功能)
 *
 *   结论：
 *       当产品等级比较固定时，可以考虑使用抽象工厂
 *       如果产品等价经常变化，则不建议使用抽象工厂
 */

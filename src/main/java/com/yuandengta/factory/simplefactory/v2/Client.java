package com.yuandengta.factory.simplefactory.v2;


/**
 * @Author:Mars
 * @Description 猿灯塔，做程序员的引导者！
 * @Date 2020/05/12
 * @个人VX:10769582
 * @官网：http://www.yuandengta.com
 */
// 针对于之前的问题：服务器代码一旦修改，客服端代码也要跟着修改
    //修改代码如下： 使用简单工厂(作者做的)设计模式

//抽象产品
interface Food{
    void eat();
}

//具体产品
class HanBao2 implements Food {

    @Override
    public void eat() {
        System.out.println("吃汉堡咯！");
    }
}

class TasteShrimp implements  Food{

    @Override
    public void eat() {
        System.out.println("口味虾真好吃");
    }
}

//食物工厂
class FoodFactory{
    public static Food getFood(String type) {
        Food food = null;
        switch (type){
            case "汉堡":
                food = new HanBao2();
                break;
            case "口味虾":
                food = new TasteShrimp();
                break;

        }
        return food;
    }
}


// ================================================================

public class Client {

    public static void main(String[] args) {
        Food food = FoodFactory.getFood("汉堡");
        food.eat();
}
}

/*
  使用简单工厂  松耦合

   优点：
       1. 具体产品的类型 从客服端代码中解耦出来
       2. 服务器端代码修改了具体产品类名，客服端不知道，这便符合我们的“面向接口编程”的思想
       这里的接口不单包括了  interface   只要是下层给上层暴露出来的 方法/类 都可以认为是 面向接口编程里面的接口形式

   缺点：
    1. 要记住 type与具体产品的映射关系
    2. 如果具体产品非常多，简单工厂的代码就会变得非常臃肿
    3. 最重要的是，如果要扩展具体产品，那么势必会修改简单工厂的代码，违反了 “开闭原则”
    4. 始终丢失原始类型

    怎么解决--》 工厂方法
 */

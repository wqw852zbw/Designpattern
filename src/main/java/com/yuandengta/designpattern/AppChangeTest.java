package com.yuandengta.designpattern;

/**
 * @Author:Mars
 * @Description 猿灯塔，做程序员的引导者！
 * @Date 2020/05/12
 * @个人VX:10769582
 * @官网：http://www.yuandengta.com
 */

// 改进
interface  Animal{
     public void eat();
        }
class Person1{
    public void feed(Animal animal){
        System.out.println("开始喂养。。。");
        animal.eat();
    }

}
class Dog1 implements  Animal{
    public void eat(){
        System.out.println("狗啃骨头");
    }
}
class Cat1 implements Animal{
    public  void eat(){
        System.out.println("猫吃鱼。。。");
    }
}
public class AppChangeTest {
    public static void main(String[] args) {
        Person1 person = new Person1();
        Dog1 dog = new Dog1();
        Cat1 cat = new Cat1();

        person.feed(dog);
        person.feed(cat);
    }
}

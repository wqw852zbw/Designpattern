package com.yuandengta.designpattern;

/**
 * @Author:Mars
 * @Description 猿灯塔，做程序员的引导者！
 * @Date 2020/05/12
 * @个人VX:10769582
 * @官网：http://www.yuandengta.com
 */
// 改进
//

class Person{
    // 人依赖于动物
     public void feed(Dog dog){
         System.out.println("开始喂养。。。");
         dog.eat();
     }
    public void feed(Cat cat){
        System.out.println("开始喂养。。。");
        cat.eat();
    }
}
class Dog{
      public void eat(){
          System.out.println("狗啃骨头");
      }
}
class Cat{
    public  void eat(){
        System.out.println("猫吃鱼。。。");
    }
}
// 此写法违反了依赖倒置，因为，每当下层变动时，上层都要跟着一起变动
public class AppTest {
    public static void main(String[] args) {
        Person person = new Person();
        Dog dog = new Dog();
        Cat cat = new Cat();

        person.feed(dog);
        person.feed(cat);
    }
}

package com.yuandengta.principle.dependencyreverse.v2;

/**
 * TODO {@link Client}
 *
 * @Author:Mars
 * @wx:10769582
 */
// 改进  抽象
interface  Animal{
    public void eat();
}
//使用方
class RichPerson{
    //依赖于抽象
    public void feed(Animal animal){
        System.out.println("开始喂养。。。");
        animal.eat();
    }

}
//具体实现
class ZangAo implements  Animal{
    public void eat(){
        System.out.println("狗啃骨头");
    }
}
//具体实现
class Ostrich implements Animal{
    public  void eat(){
        System.out.println("猫吃鱼。。。");
    }
}

//  来变化：
  class  Gecko  implements  Animal{

    @Override
    public void eat() {
        System.out.println("壁虎爱吃蚊子。。。");
    }
}
public class Client {
    public static void main(String[] args) {
        RichPerson person = new RichPerson();
        ZangAo dog = new ZangAo();
        Ostrich cat = new Ostrich();
        Gecko gk = new Gecko();

        person.feed(dog);
        person.feed(cat);
        person.feed(gk);
    }
}

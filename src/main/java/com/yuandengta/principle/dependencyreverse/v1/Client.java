package com.yuandengta.principle.dependencyreverse.v1;

/**
 * TODO {@link Client}
 *
 * @Author:Mars
 * @wx:10769582
 */
class RichPerson{
    // 人依赖于动物
    public void feed(ZangAo za){
        System.out.println("开始喂养。。。");
        za.eat();
    }
    public void feed(Ostrich os){
        System.out.println("开始喂养。。。");
        os.eat();
    }

    public void feed(YangTuo yt){
        System.out.println("开始喂养。。。");
        yt.eat();
    }
}
class ZangAo{
    public void eat(){
        System.out.println("藏獒一顿吃十几斤肉类");
    }
}
class Ostrich{
    public  void eat(){
        System.out.println("鸵鸟吃植物类为生");
    }
}

class YangTuo{
    public  void eat(){
        System.out.println("羊驼最喜欢吃生玉米");
    }
}

//变化  业务要求富人  在养一头  羊驼
//  #=================================================================
public class Client {
    public static void main(String[] args) {
        RichPerson person = new RichPerson();
        ZangAo za = new ZangAo();
        Ostrich os = new Ostrich();

        person.feed(za);
        person.feed(os);
    }
}

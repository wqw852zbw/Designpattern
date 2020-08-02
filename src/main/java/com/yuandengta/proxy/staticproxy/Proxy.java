package com.yuandengta.proxy.staticproxy;

/**
 * @Author:Mars
 * @wx:10769582
 */
//中介
public class Proxy implements Rent {

    // 有一个原则： 少用继承，多用组合
    private HouseOwner owner;

    public Proxy() {
    }

    public Proxy(HouseOwner owner) {
        this.owner = owner;
    }

    // 代理 真实角色 的业务方法
    @Override
    public void rent() {
        seeHouse();
        // 真实角色的主业
        owner.rent();
        getAgreement();
    }

    //看房
    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    //签合同
    public void getAgreement() {
        System.out.println("签租赁合同");
    }
}

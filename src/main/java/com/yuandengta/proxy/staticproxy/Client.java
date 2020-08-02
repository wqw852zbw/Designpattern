package com.yuandengta.proxy.staticproxy;

/**
 * @Author:Mars
 * @wx:10769582
 */
public class Client {
    public static void main(String[] args) {
        //房东要租房子
      HouseOwner owner = new HouseOwner();
      //代理，中介帮房东租房子，但是代理一般会有一些附属操作
      Proxy proxy = new Proxy(owner);
      //你不用面对房东，直接找中介租房即可！
      proxy.rent();

      /*
        好处：
          可以使我们真实角色操作单一，不用关注公共业务
          2. 公共业务直接丢给代理角色，实现了业务的分工
          3. 公共业务发生扩展时，方法集中管理

        坏处：
          一个真实角色就会产生一个代理角色，代码量会翻倍 开发效率低
          CRUD
       */
    }
}

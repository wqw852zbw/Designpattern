package com.yuandengta.delegate.v2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @ClassName:Test3
 * @Author: Zhengbowen
 * @Description:
 * @Date: Created in 16:10 2020/8/4
 * @Modified
 * @VERSION 1.0
 */
public class Test3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要添加的随机数数量");
        int num = scanner.nextInt();

        TreeSet set = new TreeSet();
        for (int i = 0; i < num; i++) {
            System.out.println("第"+i+"个随机数");
            set.add(scanner.nextInt());
        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

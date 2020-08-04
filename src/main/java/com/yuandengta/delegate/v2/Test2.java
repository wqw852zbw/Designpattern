package com.yuandengta.delegate.v2;

import java.util.Scanner;

/**
 * @ClassName:Test2
 * @Author: Zhengbowen
 * @Description:
 * @Date: Created in 15:29 2020/8/4
 * @Modified
 * @VERSION 1.0
 */
public class Test2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = scanner.nextLine().toLowerCase();
        System.out.println("请输入一个与之匹配的字符");
        Character c = scanner.nextLine().charAt(0);
        Character.toLowerCase(c);
        System.out.println(c);
        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            if (c == s.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}

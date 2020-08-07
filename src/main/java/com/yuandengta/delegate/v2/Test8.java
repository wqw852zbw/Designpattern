package com.yuandengta.delegate.v2;

import java.util.Scanner;

/**
 * @ClassName:Test8
 * @Author: Zhengbowen
 * @Description:
 * @Date: Created in 15:48 2020/8/6
 * @Modified
 * @VERSION 1.0
 */
public class Test8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        String str = "";
        for (int i = 0; i <chars.length ; i++) {
            if (!str.contains(chars[i] + "")) {
                str+=chars[i];
            }
        }
        System.out.println(str);
        System.out.println(str.length());
    }
}

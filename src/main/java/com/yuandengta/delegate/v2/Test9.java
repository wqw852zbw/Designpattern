package com.yuandengta.delegate.v2;

import java.util.Scanner;

/**
 * @ClassName:Test9
 * @Author: Zhengbowen
 * @Description:
 * @Date: Created in 16:14 2020/8/6
 * @Modified
 * @VERSION 1.0
 */
public class Test9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        char[] chars = (i + "").toCharArray();
        String str = "";
        System.out.println(chars[3]);
        for (int j = chars.length-1; j >-1 ; j--) {
            str+=chars[j];
        }
        System.out.println(Integer.valueOf(str));
    }
}

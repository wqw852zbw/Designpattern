package com.yuandengta.delegate.v2;

import java.util.Scanner;

/**
 * @ClassName:Test7
 * @Author: Zhengbowen
 * @Description:
 * @Date: Created in 15:36 2020/8/6
 * @Modified
 * @VERSION 1.0
 */
public class Test7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char[] chars = (num + "").toCharArray();
        System.out.println(chars);
        String str = "";
        for (int i = chars.length-1; i >0; i--) {
            if (!str.contains(chars[i]+"")){
                str += chars[i];
            }
        }
        System.out.println(Integer.valueOf(str));
    }
}

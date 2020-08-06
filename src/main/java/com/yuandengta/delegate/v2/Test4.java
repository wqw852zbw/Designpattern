package com.yuandengta.delegate.v2;

import java.util.Scanner;

/**
 * @ClassName:Test4
 * @Author: Zhengbowen
 * @Description:
 * @Date: Created in 16:50 2020/8/4
 * @Modified
 * @VERSION 1.0
 */
public class Test4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        int size = stringBuilder.length();
        int zero = 8-size%8;
        if (zero >0 && zero<8){
            while (zero >0){
                stringBuilder.append(0);
                zero--;
            }
        }
        String s1 = stringBuilder.toString();
        while (s1.length()>0){
            System.out.println(s1.substring(0,8));
            s1=s1.substring(8);
        }
    }
}

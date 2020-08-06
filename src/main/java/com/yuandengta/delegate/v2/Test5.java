package com.yuandengta.delegate.v2;

import java.util.Scanner;

/**
 * @ClassName:Test5
 * @Author: Zhengbowen
 * @Description:
 * @Date: Created in 13:18 2020/8/6
 * @Modified
 * @VERSION 1.0
 */
public class Test5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double nextDouble = scanner.nextDouble();
        int value= (int) nextDouble;
        if (nextDouble-value>0.5 && nextDouble-value<1){
            value++;
        }
        System.out.println(value);
    }
}

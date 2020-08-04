package com.yuandengta.delegate.v2;

import java.util.Scanner;

/**
 * @ClassName:test
 * @Author: Zhengbowen
 * @Description:
 * @Date: Created in 15:01 2020/8/4
 * @Modified
 * @VERSION 1.0
 */
public class test {
    public static void main(String[] args){
        System.out.println("请输入单词");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
       /* String[] s = str.split(" ");
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);
        }
        System.out.println(s.length);
        int length = s[s.length - 1].length();
        System.out.println(length);*/
        int length = str.length();
        System.out.println(length);
        int count = 0;
        for (int i = length-1; i >0 ; i--) {
            if (str.charAt(i) ==' '){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}

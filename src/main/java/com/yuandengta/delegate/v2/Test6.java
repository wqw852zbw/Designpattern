package com.yuandengta.delegate.v2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @ClassName:Test6
 * @Author: Zhengbowen
 * @Description:
 * @Date: Created in 13:35 2020/8/6
 * @Modified
 * @VERSION 1.0
 */
public class Test6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i <num ; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            if (treeMap.containsKey(key)){
                treeMap.put(key,treeMap.get(key)+value);
            }else {
                treeMap.put(key,value);
            }
        }
        for (Map.Entry<Integer,Integer> integerIntegerEntry:treeMap.entrySet()) {
            System.out.println(integerIntegerEntry.getKey()+" "+integerIntegerEntry.getValue());
        }

    }
}

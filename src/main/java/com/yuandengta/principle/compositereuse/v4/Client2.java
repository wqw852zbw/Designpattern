package com.yuandengta.principle.compositereuse.v4;

import java.util.Stack;

/**
 * @Author:Mars
 * @wx:10769582
 */
//反面教材
public class Client2 {

    public static void main(String[] args) {
        //  入栈出栈  FILO  先进后出
        Stack<String> stack = new Stack<>();
        //入栈
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        //出栈
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    //  这是先进后出？
        System.out.println(stack.remove(1));
        /*
          get  remove  导致Stack 不再是FILO
           Stack extends Vector<E>
            为了复用  remove  get  put   直接导致了 栈不是栈
             不要随便拿JDK源码来当标杆 还会有很多问题
         */
    }
}

package com.shunyi.wmy;

/**
 * Created by wumengyue on 2016/12/7.
 */
public class ShortCircuit {
    static boolean test1(int val){
        System.out.println("test1("+val+")");
        System.out.println("result:"+(val<1));
        return val<1;
    }
    static boolean test2(int val){
        System.out.println("test2("+val+")");
        System.out.println("result:"+(val<2));
        return val<2;
    }
    static boolean test3(int val){
        System.out.println("test3("+val+")");
        System.out.println("result:"+(val<3));
        return val<3;
    }
    public static void main(String[] args){
        if((test1(0))&&(test2(2))&&(test3(2)))    //短路：三个与操作，当一个返回false，则不继续执行
            System.out.println("expression is true");
        else
            System.out.println("expression is false");

        //位运算符
        System.out.println(5^2); //异或
        System.out.println(5&2); //与AND
        System.out.println(4|3); //或OR
    }
}

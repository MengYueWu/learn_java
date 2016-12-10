package com.shunyi.wmy.thinkjava_chap5;

/**
 * Created by wumengyue on 2016/12/9.
 */
public class Flower {
    int petalCount=0;
    String s="null";

    Flower(){}
    Flower(int petals){
        petalCount=petals;
        System.out.println("petalcount is "+petalCount);
    }
    Flower(String ss){
        System.out.println("");
    }
}

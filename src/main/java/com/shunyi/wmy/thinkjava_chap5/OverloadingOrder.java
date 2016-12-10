package com.shunyi.wmy.thinkjava_chap5;

/**
 *
 * Created by wumengyue on 2016/12/9.
 */

public class OverloadingOrder {
    static void prints(String s,int i){
        System.out.println(s+"'s height is "+i);
    }
    static void prints(int i,String s){
        System.out.println(i+" is tall of "+s);
    }

    public static void main(String[] args) {
      prints("a",5);prints(5, "a");
    }
}


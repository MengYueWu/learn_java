package com.shunyi.wmy;

/**
 * Created by wumengyue on 2016/12/7.
 */
public class PassObject {
    static void f(Letter y){
        y.c='z';
    }
    public static void main(String[] args){
        Letter x=new Letter();
        x.c='a';
        System.out.println("1:"+x.c);
        f(x);
        System.out.println("2:"+x.c);
    }
}
class Letter{
    char c;
}
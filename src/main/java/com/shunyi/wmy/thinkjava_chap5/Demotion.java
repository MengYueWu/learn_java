package com.shunyi.wmy.thinkjava_chap5;

/**
 *
 * Created by wumengyue on 2016/12/9.
 */
public class Demotion {
    static void prt(String s){
        System.out.println(s);
    }
    void f1(char a){prt("f1(char)");}
    void f1(byte a){prt("f1(byte)");}
    void f1(short a){prt("f1(short)");}
    void f1(int a){prt("f1(int)");}
    void f1(long a){prt("f1(long)");}
    void f1(float a){prt("f1(float)");}
    void f1(double a){prt("f1(double)");}

    void f2(byte a){prt("f1(char)");}
    public static void main(String[] args) {
        Demotion demotion=new Demotion();
        demotion.f2((byte)5);

    }
}

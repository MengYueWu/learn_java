package com.shunyi.wmy.thinkjava_chap5;


import java.util.Random;

/**
 *
 * Created by wumengyue on 2016/12/9.
 */
class Bowl{
    Bowl(int maker){
        System.out.println("bowl"+maker);
    }
    void f1(int maker){
        System.out.println("f1"+maker);
    }
}
class Table{
    static Bowl b1=new Bowl(1);
    static Bowl b2=new Bowl(2);
    Table(){
        System.out.println("Table");
        b2.f1(1);
    }
    void f2(int maker){
        System.out.println("maker");
    }
}
class Cupboard{
    Bowl b3=new Bowl(3);
    static Bowl b4=new Bowl(4);
    static Bowl b5=new Bowl(5);
    Cupboard(){
        System.out.println("Cupboard");
        b4.f1(2);
    }
    void f3(int maker){
        System.out.println("maker"+maker);
    }
    static void f4(int maker){
        System.out.println("makerw"+maker);
    }
}
public class StaticInitialization {
    public static void main(String[] args) {
        //new Cupboard();
        //table.f2(1);
        //cupboard.f3(1);
        Random random=new Random(3);
        System.out.println(random.nextInt(3));

    }
   // static Table table =new Table();
   // static Cupboard cupboard=new Cupboard();
}

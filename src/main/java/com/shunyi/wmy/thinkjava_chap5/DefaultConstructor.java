package com.shunyi.wmy.thinkjava_chap5;

/**
 *
 * Created by wumengyue on 2016/12/9.
 */
class Bird{
    int i;
    void Bird(){}
    void  Bird(int i){
        System.out.println("s");
    }
    void  f1(int i){
        System.out.println(i);
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        Bird bird1=new Bird(),bird2=new Bird();
        bird1.f1(3);
        bird2.f1(4);
    }
}

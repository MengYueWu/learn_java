package com.shunyi.wmy.thinkjava_chap5;

/**
 * Created by wumengyue on 2016/12/9.
 */
public class Window {
    Window(int maker){
        System.out.println("window is "+maker);
    }
}
class House{
    Window w1=new Window(1);
    Window w2=new Window(2);
    Window w3=new Window(3);
    House(){
        System.out.println("House");
        w3=new Window(33);
    }
    void f(){
        System.out.println("f()");
    }

    public static void main(String[] args) {
        House house=new House();
        house.f();
    }
}



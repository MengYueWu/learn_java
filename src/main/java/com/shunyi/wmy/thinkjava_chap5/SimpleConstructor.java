package com.shunyi.wmy.thinkjava_chap5;

/**
 *
 * Created by wumengyue on 2016/12/9.
 */
class Rocks{
        Rocks(int i){
            System.out.println("Rocks："+i);    //类的默认构造器，在类的初始化过程中自动调用
        }
        }
public class SimpleConstructor {

    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            new Rocks(i);  //对对象进行初始化
        }
    }
}

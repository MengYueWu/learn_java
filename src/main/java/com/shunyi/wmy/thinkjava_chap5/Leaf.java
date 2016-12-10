package com.shunyi.wmy.thinkjava_chap5;

/**
 *
 * Created by wumengyue on 2016/12/9.
 */
public class Leaf {
    private int i;
    void print(){
        System.out.println("i= "+i);
    }
    Leaf increment(){       //返回值类型是对象
        i++;
        return this;
    }
    public static void main(String[] args) {
        Leaf leaf=new Leaf();
        leaf.increment().increment().print();
    }
}


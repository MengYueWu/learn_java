package com.shunyi.wmy;

/**
 * Created by wumengyue on 2016/12/7.
 */
public class Assignment {
    public static void main(String[] args)
    {
        Number n1=new Number();
        Number n2=new Number();
        n1.i=9;n1.j=10;
        n2.i=47;n2.j=11;
        System.out.println("1:"+n1.i+";"+n2.i);
        System.out.println("1:"+n1.j+";"+n2.j);
        n1.j=n2.j;
        System.out.println("1:"+n1.i+";"+n2.i);
        System.out.println("1:"+n1.j+";"+n2.j);
        n1=n2;  //对象拷贝，指向相同的句柄
        System.out.println("2:"+n2.i+";"+n2.i);
        System.out.println("1:"+n1.j+";"+n2.j);
        n1.i=27;n2.j=5;
        System.out.println("2:"+n2.i+";"+n2.i);
        System.out.println("1:"+n1.j+";"+n2.j);
    }
}
class Number{
    int i;
    int j;
}

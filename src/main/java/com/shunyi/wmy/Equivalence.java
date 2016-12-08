package com.shunyi.wmy;

/**
 * Created by wumengyue on 2016/12/7.
 */
public class Equivalence {
    public static void main(String[] args){
        //对象的值相同，但是句柄不同，比较的是对象的句柄
        Integer n1= 47;
        Integer n2=new Integer(47);
        System.out.println(n1==n2);
        System.out.println(n1!=n2);

        System.out.println(n1.equals(n2));   //equals()方法不适用主类型，在主类型中比较的是对象实际的值

        Value v1=new Value();
        Value v2=new Value();
        v1.i=v2.i=100;
        System.out.println(v1.equals(v2));   //equals()方法在新建的类型中默认比较对象的句柄，而不是实际的值
    }

}
class Value{
        int i;
}

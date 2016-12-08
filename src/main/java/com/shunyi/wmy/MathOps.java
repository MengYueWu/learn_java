package com.shunyi.wmy;
import jdk.internal.dynalink.beans.StaticClass;

import java.beans.Statement;
import java.util.*;
/**
 * Created by wumengyue on 2016/12/7.
 */
public class MathOps {
    //Create a shorthand to save typing
    static void prt(String s){
        System.out.println(s);
    }
    //shorthand to print a string and an int
    static void pInt(String s,int i){
        prt(s + "=" + i);
    }
    static void pFloat(String s,float f){
        prt(s+"="+f);
    }
    public static void main(String[] args){

        //create a random number generator
        Random random=new Random();
        int i,j,k;
        j=random.nextInt()%100;  //%限制了最大数为99
        k=random.nextInt()%100;
        pInt("j=",j);pInt("k=",k);
        i=j+k;pInt("j+k=",i);
        i=j-k;pInt("j-k=",i);
        i=k/j;pInt("k/j=",i);
        i=k*j;pInt("k*j=",i);
        i=k%j;pInt("k/j=",i);
        j%=k;pInt("j%=k=",i);

        //Floating-point number tests
        float u,v,w;
        v=random.nextFloat();
        u=random.nextFloat();
        pFloat("v=",v);pFloat("u=",u);
        w=v+u;pFloat("v+u=",w);
        w=v-u;pFloat("v-u=",w);
        w=v*u;pFloat("v*u=",w);
        w=v/u;pFloat("v/u=",w);
        u+=v;pFloat("u+=v=",u);
        u-=v;pFloat("u-=v=",u);
        u*=v;pFloat("u*=v=",u);
        u/=v;pFloat("u/=v=",u);
    }
}

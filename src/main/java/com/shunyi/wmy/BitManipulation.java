package com.shunyi.wmy;

import java.util.Random;

/**
 *
 * Created by wumengyue on 2016/12/7.
 */
public class BitManipulation{
    static void pBinInt(String s,int i){
        System.out.print(
                s + ",int:" + i + ",binary:");
        System.out.print("  ");
        for (int j=31;j>=0;j--){
            if (((1<<j) & i )!=0)
                System.out.print("1");
            else
                System.out.print("0");
        }
        System.out.println();
    }
    static void pBinLong(String s,long l){
        System.out.print(
                s + ",Long:" + l + ",binary:");
        for (long i=63;i>=0;i--){
            if (((1l<<i)& l)!=0)
                System.out.print("1");
            else
                System.out.print("0");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Random rand=new Random();
        int i=rand.nextInt();
        int j=rand.nextInt();
        pBinInt("-1",-1);
        pBinInt("+1",+1);

    }

}

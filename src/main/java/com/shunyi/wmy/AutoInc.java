package com.shunyi.wmy;

/**
 * Created by wumengyue on 2016/12/7.
 */
public class AutoInc {
    public static void main(String[] args){
        int i=1;
        prt("i="+i);
        prt("++i:"+ ++i);
        prt("i="+i);
        prt("i++:"+ i++);
        prt("i="+i);
        prt("--i:"+ --i);
        prt("i="+i);
        prt("i--:"+ i--);


        //////
    }

    static void prt(String s){
        System.out.println(s);
    }
}

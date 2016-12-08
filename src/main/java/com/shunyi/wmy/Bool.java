package com.shunyi.wmy;
import java.util.*;

/**
 * Created by wumengyue on 2016/12/7.
 */
public class Bool {
    public static void main(String[] args){
        Random random=new Random();
        int i=random.nextInt()%100;
        int j=random.nextInt()%100;
        prt("i="+i);
        prt("j="+j);
        prt("i>j is"+(i>j));
        prt("i<j is"+(i<j));
        prt("i<=j is"+(i<=j));
        prt("i>=j is"+(i>=j));
        prt("i==j is"+(i==j));
        prt("i!=j is"+(i!=j));

        prt("(i<10)&&(j<10)"+((i<10)&&(j<10)));
        prt("(i<10)||(j<10)"+((i<10)||(j<10)));

    }
    static void prt(String s){
        System.out.println(s);
    }
}

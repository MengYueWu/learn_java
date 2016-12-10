package com.shunyi.wmy.thinkjava_chap5;



/**
 * Created by wumengyue on 2016/12/8.
 */
public class Rock {
    int i;
    static int b;
    Rock(){}
    Rock(int i){

        this(8,"jskdj");
        System.out.println("Rock"+i);

    }
    Rock(int i,String s){
        this.i=i;
        System.out.println("Rock"+s+"-----"+i);
        tree("e");
    }

    public static String tree(String tree){
        System.out.println(tree);
        return tree;
    }


    public static void main(String[] args){
        new  Rock(5);
        //new Rock(5,"q");
        //new Rock(1).tree("tree");
        //Rock rock = new Rock(1);
        //rock.tree("tree");
        //new Rock();


    }

}

package com.shunyi.wmy.thinkjava_chap5;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 *
 * Created by wumengyue on 2016/12/9.
 */
class Tree{
    int height;
    Tree(){
        System.out.println("tree height is 5");
        height=5;
    }
    Tree(int i){
        System.out.println("tree height is"+i);
        height=i;
    }
    void TreeInfo(){
        System.out.println("the tree is "+height+" tall");
    }
    void TreeInfo(int height){
        System.out.println("the tree is "+height+" tall");
    }
}
public class Overloading {
    public static void main(String[] args) {
        //new Tree();
        new Tree(8).TreeInfo(9);
       // Tree tree=new Tree();
        //tree.TreeInfo();
    }
}

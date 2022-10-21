package javaInterview;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

class A{
    protected long x = 15;
    public final void show(long x){
        System.out.println("I am A "+x);
    }
}

class B extends A{




}


class t{
    private static final t instance = new t();
    public String s;
    private t(){}
    public static t getInstance(){
        return instance;
    }
}


public class Program3 {

       private static long counter =1111;

       static{
           counter = counter-- - --counter;
       }

    public static void main(String[] args){
        //sdkjk kjd
        // \n System.out.println("hi");

        int i = 11+ +10- -12+ +13- -14+15;
        System.out.println(i);
        System.out.println(counter);
    }


    public static void addToCounter(int number){
        System.out.println(number+" ");
    }



}

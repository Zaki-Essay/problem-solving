package javaInterview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseCollection {


    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(16);


        Collections.reverse(list);

        System.out.println(list);

        int[] a= new int[5];


        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println(Math.round(4.5));






    }


}

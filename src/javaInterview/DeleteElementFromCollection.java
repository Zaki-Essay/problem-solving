package javaInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class DeleteElementFromCollection {



    public static void main(String[] args){

        List<Integer> list =new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);

        Integer a =3;
        list.remove(0);
        list.remove(a);

        System.out.println(list);




    }
}

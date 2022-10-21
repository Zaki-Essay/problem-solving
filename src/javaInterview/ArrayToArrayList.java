package javaInterview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {


    public static void main(String[] args){


        //the first Method to convert array to fixed size list
        String[] strings = {"abc","cdb","ccd"};
        List<String> list = List.of(strings);

        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,strings);

        List<String> list3 = new ArrayList<>();
        for (String string : strings) {
            list3.add(string);
        }


        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);


    }
}

package javaInterview;

import java.util.*;

public class ReveresElementInArrayList {



    public static void main(String args[]){

     List<Integer> list = new ArrayList<>();
     int[] array = {1,2,3,4,5,6};

     list.add(1);
     list.add(12);
     list.add(13);
     list.add(14);
     list.add(15);
     list.add(16);



     Collections.reverse(list);

    }
}

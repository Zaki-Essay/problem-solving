package javaInterview;

import java.util.HashSet;
import java.util.Set;

public class CheckTheArrayIsDuplicates {

    public static void main(String[] args){
        int[] array={1,2,3,4,5};

        System.out.println(containsDuplicateElement(array));


    }


    public static boolean containsDuplicateElement(int[] array){

        boolean containDuplicate = false;
        Set<Integer> nonDuplicate = new HashSet<>();

        for (int i = 0; i < array.length; i++) {

            if (nonDuplicate.contains(array[i])){
                containDuplicate=true;
                break;
            }else{
                nonDuplicate.add(array[i]);
            }



        }

        return containDuplicate;
    }
}

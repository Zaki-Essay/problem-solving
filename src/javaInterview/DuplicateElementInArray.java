package javaInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

    public static void main(String[] args){

        int[] array = {1,2,3,4,5,6,1,3,2,4};


        System.out.println(Arrays.toString(solution(array)));




    }

    /*
    * how to get all duplicated elements in an array using O(n) time complexity and O(n)
    *
    * */

    public static int[] solution(int[] array){

        Set<Integer> duplicatesElement = new HashSet<>();

        Set<Integer> nonDuplicatesElement = new HashSet<>();


        for (int j : array) {

            if (!nonDuplicatesElement.contains(j)) {
                nonDuplicatesElement.add(j);
            } else {
                duplicatesElement.add(j);
            }
        }

        if (duplicatesElement.size()==0){
            throw new IllegalArgumentException("duplicates elements not found");


        }else{

            int[] result = new int[duplicatesElement.size()];
            int i=0;
            for (Integer a:duplicatesElement){
                result[i++] = a;
            }
            return result;
        }


    }
}

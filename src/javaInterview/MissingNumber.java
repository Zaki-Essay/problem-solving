package javaInterview;

import java.util.Arrays;

public class MissingNumber {

    //given an array and we should return if the array is missing element array or is completly full
    //time complexity O(n) space complexity is o(1)
    //1 <= array[i]<=n
    public static void main(String[] args){

            int[] array = {6,4,3,2,1};

            System.out.println(isComplete(array));


    }



    public static boolean isComplete(int[] array){


        Arrays.sort(array);


        return array.length==array[array.length-1];


    }



}

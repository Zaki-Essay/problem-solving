package javaInterview;

import java.util.Arrays;

public class MinMAx {


    public static void main(String[] args){


        int[] array = {21,43,24,5,67,87,57};


        System.out.println(Arrays.toString(solution(array)));


    }

    //time complexty is O(n)
    public static int[] solution(int[] array){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++){

            if (max<array[i]){
                max=array[i];
            }


            if (min>array[i]){
                min=array[i];
            }

        }

        return new int[]{ min, max};
    }
}

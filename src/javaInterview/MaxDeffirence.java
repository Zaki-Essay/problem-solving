package javaInterview;

import java.util.Arrays;

public class MaxDeffirence {

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9};

        System.out.println(solution(array));

    }

    //the first method : time complexity O(n)
    public static int solution(int[] array){

        int max =Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++){
            if (max<array[i]) max=array[i];
            if (min>array[i]) min=array[i];

        }
        return max-min;

    }
}

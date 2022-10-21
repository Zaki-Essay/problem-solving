package javaInterview;

import java.util.Arrays;

public class SmallestAndLargestElement {



    public static void main(String[] args){

        int[] array = {12,1,34,3,45,6,47,8,56,7,24,3,1};

        printTable(solution2(array));


    }


    //la solution with O(n)
    public static int[] solution(int[] array){


        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;


        for (int i = 0; i < array.length; i++) {

            if (max<array[i]){
               max = array[i];
            }


            if (min>array[i]){
                min = array[i];
            }

        }

        return new int[]{min,max};
    }


    //une approach with O(nlogn)
    public static int[] solution2(int[] array){
        Arrays.sort(array);//O(nLogN)

        return new int[]{array[0],array[array.length-1]};


    }


    public static void printTable(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

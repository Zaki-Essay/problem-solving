package javaInterview;

import java.util.Arrays;

public class TheSecondLargestElement {


    // in this exemple given an array and we will try to find the second largest element in this array


    public static void main(String[] args){

        int[] array  = {12,34,56,86,86,86,75,75,75,75,3,4};

        System.out.println(solution3(array));






    }


    public static int solution1(int[] array){

        if (array.length<2) return -1;
        Arrays.sort(array);
        for (int i = array.length-1; i >=0 ; i--) {

            if (array[i-1]!=array[i]){

                return array[i-1];
            }

        }

        return -1;


    }

    public static int solution2(int[] array){


        int firstMax = array[0];

        int secondMax = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i]>firstMax){
                secondMax = firstMax;
                firstMax = array[i];
            }else if (array[i]>secondMax && array[i]!= firstMax){
                secondMax = array[i];

            }
        }

        return secondMax;

    }

    public static int solution3(int[] array){


        //the base condition

        if (array.length<2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            if (array[i]>largest){
                largest = array[i];
            }

        }


        for (int i=0;i<array.length;i++){


            if(array[i]>secondLargest && array[i]!=largest){
                secondLargest = array[i];

            }
        }


        return secondLargest;






    }
}

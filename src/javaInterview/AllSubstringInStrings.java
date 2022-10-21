package javaInterview;


import java.util.*;

public class AllSubstringInStrings {


    public static void solution(int[] s){


        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }

        System.out.println();



    }

    public static void main(String[] args){
        int[] heights = {1,1,4,2,1,3};
        int[] helperArray = new int[heights.length];
        System.arraycopy(heights,0,helperArray,0,heights.length);

        //sort the array

        Arrays.sort(helperArray);


        int counter = 0;
        for(int i=0;i<helperArray.length;i++){

            if( helperArray[i]==heights[i]){
                counter++;
            }
        }

        System.out.println(counter);



    }





}

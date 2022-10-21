package javaInterview;

import java.util.Arrays;

public class MoveAllZerosToTheEnd {


    public static void main(String[] args){

        int[] array = {1,2,0,0,0,0,0,3,4,4};

        System.out.println(Arrays.toString(move(array)));

    }


    public static int[] move(int[] array){
       int pointerA=0;
       int pointerB =array.length-1;
       int[] helper = new int[array.length];
       for(int i=0;i<array.length;i++){
           if (array[i]==0){
               helper[pointerB--]=array[i];
           }else{

               helper[pointerA++]=array[i];
           }

       }

       return helper;

    }
}

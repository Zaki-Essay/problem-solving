package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class copyArray {



    public static void main(String args[]){


       int[] array1 = {
            1, 2, 3, 4, 5, 6, 7, 8, 9
        };

       int[] array2 = {
         11,12,13,14,15,16,17,18
       };

        int[] array = new int[array1.length+array2.length];


        for (int i = 0; i < array1.length; i++) {
                array[i] = array1[i];
        }

        for (int i = array1.length; i < array1.length+array2.length; i++) {
            array[i] = array2[i-array1.length];
        }


        for (int item:array){
            System.out.print(item+" ");
        }

        int[] arr =  new int[array1.length+array2.length];

        System.arraycopy(array1,0,arr,0,array1.length);

        System.arraycopy(array2,0,arr,array1.length,array2.length);
        System.out.println();
        for (int item:arr){
            System.out.print(item+" ");
        }


    }



}

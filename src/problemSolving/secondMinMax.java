package problemSolving;

import java.util.*;

public class secondMinMax {


    public static void main(String args[]){
        int[] arr = {7,6,5,4,3,2,1,1,1,1,1,2,3,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,7,4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int secondMax = arr[arr.length-2];
        int secondMin = arr[1];

        int max = arr[arr.length-1];
        int min = arr[1];
        int i = arr.length-3;
        while(secondMax==max){
            secondMax = arr[i];
            i--;
        }

        i=2;
        while(secondMax==max){
            secondMax = arr[i];
            i++;
        }

        for (int j : arr) {
            System.out.println(j);
        }

        System.out.println("the second largest in the array is : "+arr[arr.length-2]);
        System.out.println("the second smallest in the array is : "+arr[1]);







    }
}

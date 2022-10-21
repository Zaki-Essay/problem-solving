package javaInterview;

import java.util.Scanner;

public class ArraySum {


    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int[] array = new int[length];

        for(int i=0;i<length;i++){
            array[i] = scanner.nextInt();
        }

        for(int i:array){
            System.out.println(i);
        }

        int sum = 0;

        for(int i=0;i<array.length;i++){

            sum+=array[i];


        }

        System.out.println(sum);



    }
}

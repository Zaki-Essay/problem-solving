package problemSolving;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProblemsAboutPrimeNumbers {


    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int inputNumber = scan.nextInt();


        numberOfPrime(1,20);

        printPrims(inputNumber);



    }


    public static void numberOfPrime(int start,int end){
        List<Integer> list = new ArrayList<>();
        for (int i = start;  i <= end; i++) {

            if (isPrime(i)){
                list.add(i);
            }

        }

        System.out.println("the totale number of prime is : "+list.size()+" the largest is :  "+ Collections.max(list));

    }


    public static boolean isPrime(int number){

        if (number==2){
            return false;
        }


        for (int i = 2; i <number; i++) {
            if (number%i==0){
                return false;
            }
        }


        return true;
    }



    public static void printPrims(int numberOfPrims){

        int count =0;


        int i = 1;
        while (count<numberOfPrims){
            if (isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
    }


}

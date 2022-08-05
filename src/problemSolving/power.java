package problemSolving;

import java.util.Scanner;

public class power {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("give the base : ");
        int base = scan.nextInt();
        System.out.println("give the exponent");
        int exponent = scan.nextInt();

        int result=1;
        while(exponent>0){

           result*=base;
            exponent--;


        }

        System.out.println("the result is : "+result);
    }
}

package problemSolving;

import java.util.Scanner;

public class numberOfDigits {


    public static void main(String args[]){

            sumMultiplication();

    }



    public static void digits(){

        Scanner scan = new Scanner(System.in);

        int inputNumber = scan.nextInt();
        int digit=0;
        do{
            digit = inputNumber%10;
            inputNumber/=10;
            System.out.println(digit);
        }while(inputNumber>10);

        System.out.println(inputNumber);
    }

    public static void sumMultiplication(){
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int sum = 0,mul = 1;
        for (int i = number1+1; i <number2 ; i++) {
            sum+=i;
            mul*=i;
        }
        System.out.println("la somme est : "+sum+" la multiplication est : "+mul);

    }
}

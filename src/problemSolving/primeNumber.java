package problemSolving;

import java.util.Scanner;

public class primeNumber {


    public static void main(String args[]){


        Scanner scan = new Scanner(System.in);

        int inputNumber = scan.nextInt();

        if (isPrime(inputNumber)){
            System.out.println("yes");
        }else
            System.out.println("no");

    }


    public static boolean isPrime(int number){


        for (int i = 2; i < number; i++) {

            if (number%i==0){
                return false;
            }

        }
        return true;
    }
}

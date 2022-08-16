package problemSolving;

import java.util.Scanner;

public class problem22 {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();


        System.out.println("la valeur de number1 : "+number1+" est de number2 : "+number2);
        number1 = number2+number1;
        number2 = number1-number2;
        number1 = number1-number2;
        System.out.println("la valeur de number1 : "+number1+" est de number2 : "+number2);


    }
}

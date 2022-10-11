package problemSolving;

import java.util.Scanner;

public class Problem46 {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        for (int i = 0; i < secondNumber; i++) {
            int lastDigits = firstNumber%10;
            if (lastDigits==0){
                firstNumber/=10;
            }else{
                firstNumber--;
            }

        }

        System.out.println(firstNumber);



    }
}

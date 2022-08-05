package problemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int input1 = scan.nextInt();
        
        int input2 = scan.nextInt();
        
        int input3 = scan.nextInt();


        int sum=0;
        for (int i = 1; i <= input1; i++) {
            int sumOfDigits=0;
            if (sumDigits(i)>=input2 && sumDigits(i)<=input3){
                sum+=i;
            }

        }
        System.out.println(sum);


    }


    public static int sumDigits(int number){
        int sum=0;

        while (number>0){
            sum+=number%10;

            number/=10;
        }



        return sum;
    }
}

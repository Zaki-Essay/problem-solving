package problemSolving;

import java.util.Scanner;

public class Problem25 {



    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number==0||number==1){
            System.out.println(false);
            return;
        }


        for (int i = 2; i <= number/2; i++) {

            if (number%i==0){
                System.out.println(false);
                return;
            }

        }

        System.out.println(true);
    }
}

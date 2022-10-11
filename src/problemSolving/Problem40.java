package problemSolving;

import java.util.Scanner;

public class Problem40 {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i==number){
                if (i%2==0){
                    System.out.print("I love it");
                }else{
                    System.out.print("I hate it");
                }

            }else{

                if (i%2==0){
                    System.out.print("I love that ");
                }else{
                    System.out.print("I hate that ");
                }

            }


            //hi the how are you
        }


    }
}

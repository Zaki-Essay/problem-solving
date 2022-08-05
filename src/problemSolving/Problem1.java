package problemSolving;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int inputNumber = scan.nextInt();


        if (inputNumber==2){
            System.out.println("NO");
            System.exit(0);
        }



        if (inputNumber%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}

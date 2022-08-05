package problemSolving;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Long inputNumber=scan.nextLong();


        if (inputNumber<=1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}

package problemSolving;

import java.util.Scanner;

public class Problem8 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        long number = scan.nextInt();

        System.out.println(number*(number+1)/2);
    }
}

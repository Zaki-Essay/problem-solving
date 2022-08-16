package problemSolving;

import java.util.Scanner;

public class problem16 {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int limakWidth = scanner.nextInt();
        int bobWidth = scanner.nextInt();

        int numberOfYear =0;
        while (limakWidth<=bobWidth){
            limakWidth*=3;
            bobWidth*=2;
            numberOfYear++;
        }

        System.out.println(numberOfYear);


    }
}

package problemSolving;

import java.util.Scanner;

public class Problem36 {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        String output = "EASY";
        for (int i = 0; i < number; i++) {
            int response = scanner.nextInt();
            if (response==1){
                output="HARD";
            }
        }

        System.out.println(output);
    }
}

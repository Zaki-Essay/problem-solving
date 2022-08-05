package problemSolving;

import java.util.Scanner;

public class problem5 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int counter=1;
        for (int i = 0; i <input ; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(counter+" ");

                counter++;
            }
            System.out.print("PUM\n");
            counter++;

        }


    }
}

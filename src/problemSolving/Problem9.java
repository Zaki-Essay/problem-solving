package problemSolving;

import java.util.Scanner;

public class Problem9 {


    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        long pro=1;

        for (int i = 0; i <4 ; i++) {
            int number = scan.nextInt();

            pro*=number;

            
        }

        System.out.println(pro);
        


    }
}

package problemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem18 {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        int counter = scanner.nextInt();
        int born = scanner.nextInt();

        int result=0;
        while (counter>0){


            String input = scanner.next();
            int temp=0;
            for (int i = 0; i <= born; i++) {



                if (input.contains(String.valueOf(i))){
                    temp++;
                }


            }
         //System.out.print("\nborn : "+born+ " temp : " +temp   +" length : "+ input.length()+"    \n");
            if (temp==born+1){
                result++;
            }


            counter--;
        }

        System.out.println(result);



    }
}

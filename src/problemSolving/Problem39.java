package problemSolving;

import java.util.Scanner;

public class Problem39 {


    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        //1 2 : i hate that I love it
        String usefulString = "I hate";
        StringBuilder result=new StringBuilder();
        int i=0;
        while (i<number){
            result.append(usefulString);
            if (usefulString.equals("I hate")){
                usefulString = "I love";
            }else if(usefulString.equals("I love")){
                usefulString = "I hate";
            }
           i++;
            if (i<number){
                result.append(" that");
            }
            result.append(" ");
        }
        result.append(" it");


        System.out.println(result);
    }
}

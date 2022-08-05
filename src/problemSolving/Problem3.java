package problemSolving;

import java.util.Scanner;

public class Problem3 {

   public static void main(String[] args) {



       Scanner scan = new Scanner(System.in);

       int numberOfTerm = scan.nextInt();


       StringBuilder result= new StringBuilder();
       while(numberOfTerm>0){

           numberOfTerm--;
           int number = scan.nextInt();

           if (number==0){
               result.append(number).append("\n");
               continue;
           }

           while(number>0){

               result.append(number % 10).append(" ");

               number/=10;


           }

           result.append("\n");









       }
       System.out.println(result);
   }
}

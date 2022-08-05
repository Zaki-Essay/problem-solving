package problemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ThreeNumbers {

    public static void main(String[] args){

        maxMinOfList();
    }



    public static void maxMinOfList(){


        Scanner scan = new Scanner(System.in);

        int i=0;
        int number;
        List<Integer> listOfNumber=new ArrayList<>();

        while(i<10){
            System.out.println("give me a number");
            number = scan.nextInt();
            if (!listOfNumber.contains(number)){
                i++;
                listOfNumber.add(number);
            }


        }
        System.out.println("the max is  : "+Collections.max(listOfNumber));
        System.out.println("the min is   : "+Collections.min(listOfNumber));
    }
}

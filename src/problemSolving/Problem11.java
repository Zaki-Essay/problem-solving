package problemSolving;

import java.util.List;
import java.util.Scanner;

public class Problem11 {


    public static void main(String[] args){
        char initialChar = 97;
        Scanner scan = new Scanner(System.in);

        String stringToPrint = scan.next();
        int numberOfRotation=0;
        char[] listOfChar = stringToPrint.toCharArray();

        for (char c : listOfChar) {

            int result = Math.abs(c - initialChar);

            if (result <= 13) {
                numberOfRotation += result;

            } else {
                numberOfRotation += (26 - result);
            }

            initialChar=c;


        }


        System.out.println(numberOfRotation);

    }
}

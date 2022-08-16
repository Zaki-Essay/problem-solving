package problemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem20 {


    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();

        char[] listOfChar = string.toCharArray();

        for (int i = 0; i < listOfChar.length/2; i++) {

            char cara = listOfChar[i];

            listOfChar[i] = listOfChar[listOfChar.length-1-i];

            listOfChar[listOfChar.length-i-1] = cara;



        }

        string = String.valueOf(listOfChar);
        System.out.println(string);


    }
}

package problemSolving;

import java.util.Scanner;

public class problem21 {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        StringBuilder reversedString = new StringBuilder();

        if (string==null){
            throw new IllegalArgumentException("null is invalid input");
        }

        for (int i = string.length()-1; i > 0; i++) {

            reversedString.append(string.charAt(i));

        }

        System.out.println(reversedString);




    }
}

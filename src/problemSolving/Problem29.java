package problemSolving;

import java.util.Locale;
import java.util.Scanner;

public class Problem29 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i)!=' '){
                stringBuilder.append(string.charAt(i));
            }
        }

        System.out.println(stringBuilder);


        //
        StringBuilder stringBuilder1 = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (!Character.isWhitespace(string.charAt(i))){
                stringBuilder1.append(string.charAt(i));
            }
        }


        System.out.println(stringBuilder1);




    }




}

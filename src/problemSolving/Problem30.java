package problemSolving;

import java.util.Locale;
import java.util.Scanner;

public class Problem30 {

    public static void main(String[] args){

        //' aze aze '  => 'aze aze' '   az  az  az  az     '
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        char[] stringsList = string.toCharArray();

        for (char c : stringsList) {
            System.out.println(c);
        }
        StringBuilder stringBuilder= new StringBuilder();

        int start=0;
        for (int i = 0; i < stringsList.length; i++) {
            if (stringsList[i]!=' '){
               break;
            }else{
                start=i+1;
            }
        }

        int end=stringsList.length-1;
        for (int i = stringsList.length-1; i >=0; i--) {
            if (stringsList[i]!=' '){
               break;
            }else{
                end-=1;
            }
        }

        for (int i = start; i <=end ; i++) {

            stringBuilder.append(stringsList[i]);


        }
        string.trim();
        string.strip();

        System.out.println(stringBuilder);







    }
}

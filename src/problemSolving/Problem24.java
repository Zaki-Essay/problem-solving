package problemSolving;

import java.util.Locale;
import java.util.Scanner;

public class Problem24 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        string = string.toLowerCase();
        if (string.matches(".*[aueio].*")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }


    }
}

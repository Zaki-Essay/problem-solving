package problemSolving;

import java.util.Locale;
import java.util.Scanner;

public class Problem23 {
    //la solution sans streams
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        final String vowels = "auieo";
        string = string.toLowerCase();
        boolean flag = false;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (vowels.charAt(j) == string.charAt(i)) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag == false) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }

    }
}

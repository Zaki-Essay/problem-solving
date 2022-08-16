package problemSolving;

import com.sun.nio.sctp.SendFailedNotification;

import java.util.Scanner;

public class Problem37 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            String string = scanner.next();
            String end = string;
            if (string.length() > 5) {
                end  = string.substring(string.length()-5);

            }

            if (end.contains("po")){
                System.out.println("FILIPINO");
            }
            if (end.contains("desu") || end.contains("masu")){
                System.out.println("JAPANESE");
            }

            if (end.contains("mnida")){
                System.out.println("KOREAN");
            }
        }

    }
}

package problemSolving;

import java.util.Scanner;

public class Problem38 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            String s = scanner.next();

                if (s.endsWith("desu") || s.endsWith("masu")){
                    System.out.println("JAPANESE");

                }

                if (s.endsWith("mnida")){
                    System.out.println("KOREAN");

                }

                if (s.endsWith("po")){
                    System.out.println("FILIPINO");

                }

        }
    }
}

package problemSolving;

import java.util.List;
import java.util.Scanner;
// problem link : https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/Q
public class digitsProblemWithCollections {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRound = scanner.nextInt();

        int j=1;
        while (j<=numberOfRound){
            int inputNumber = scanner.nextInt();
            String inputString = String.valueOf(inputNumber);
            List<String> strTap = List.of(inputString.split(""));


            for (int i=strTap.size()-1;i>=0;i--) {
                System.out.print(strTap.get(i)+" ");

            }
            System.out.println();
            j++;

        }


    }
}

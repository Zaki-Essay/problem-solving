package problemSolving;

import java.util.Scanner;

// problem link : https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/Q
public class digitsProblemWithoutCollections {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int numberOfTurn = scanner.nextInt();
        int j=1;
        while (j<=numberOfTurn){

            int inputNumber = scanner.nextInt();
            String outputString  = "";
            while (inputNumber>=10){
                int rest = inputNumber%10;
                inputNumber/=10;
                outputString+=rest+" ";



            }
            outputString+=inputNumber;
            System.out.println(outputString);
            j++;

        }

    }
}

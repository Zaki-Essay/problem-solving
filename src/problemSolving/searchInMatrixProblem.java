package problemSolving;

import java.util.Arrays;

// problem : https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/S?fbclid=IwAR3JjUf1JLsit1-xplYZTH8vuWQR_YtErwvcvFsgXlm9xyNmenBi-oxx7Mo
import java.util.Scanner;

public class searchInMatrixProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRow = scanner.nextInt();
        int numberOfCol = scanner.nextInt();
        int[][] tab2D = new int[numberOfRow][numberOfCol];



        for (int i = 0; i < numberOfRow; i++) {
            for (int j = 0; j < numberOfCol; j++) {
                tab2D[i][j] = scanner.nextInt();
            }

        }


        int numberToFind = scanner.nextInt();
        boolean exist=false;
        for (int i = 0; i < numberOfRow; i++) {
            for (int j = 0; j < numberOfCol; j++) {
                if (numberToFind==tab2D[i][j])
                {
                    exist=true;
                   break;
                }

            }
            if (exist==true){
                break;
            }


        }
        if (exist==true) System.out.println("will not take number");
        else System.out.println("will take number");


    }
}

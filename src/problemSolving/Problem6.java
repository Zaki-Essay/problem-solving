package problemSolving;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        boolean exist = false;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                matrix[i][j] = scan.nextInt();

            }

        }

        int number = scan.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == number){
                    exist = true;
                    break;
                }

            }



        }
        if (exist){
            System.out.println("will not take number");
        }else{
            System.out.println("will take number");
        }
    }


}

package problemSolving;

import java.util.Scanner;

public class Problem17 {

    public static void main(String[] args){
        final int TEAM_SIZE=3;
        Scanner scan = new Scanner(System.in);
        int linges = scan.nextInt();


        int[][] solutionMatrix = new int[linges][3];
        for (int i = 0; i < linges; i++) {
            for (int j = 0; j < TEAM_SIZE; j++) {
                solutionMatrix[i][j] = scan.nextInt();

            }
        }


        int numberOfSolution=0;
        for (int i = 0; i < linges; i++) {
            int contestI=0;
            for (int j = 0; j < TEAM_SIZE; j++) {
                if (solutionMatrix[i][j]==1){
                    contestI++;
                }
            }
            if (contestI>1){
                numberOfSolution++;
            }
        }

        System.out.println(numberOfSolution);
    }
}

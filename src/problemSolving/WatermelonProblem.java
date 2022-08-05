package problemSolving;



/*
 problem :  https://codeforces.com/problemset/problem/4/A
 */

import java.util.Scanner;

public class WatermelonProblem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int weight = scan.nextInt();

        if (weight%2==0){  //if the weight is an even number so there's two case if the 14->7  7 -> 6  8 | 16->8  8
            if (weight!=2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }


    }


}

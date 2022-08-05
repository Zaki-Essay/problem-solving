package problemSolving;

import java.util.Scanner;

/*
* problem : https://codeforces.com/group/ndZ5Fwlwj8/contest/312340/problem/B?fbclid=IwAR1i3LD3TLBsWLeAMCMMX4WnC8Pfm95ust5c_EDGqzRaUmP4DvVB35jwnNc
* */

public class FactorialProblem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        //in this problem all number factoriel is even except fact of 1 and 0
       if (number>=2){
           System.out.println("YES");
       }else{
           System.out.println("NO");
       }

    }
}

package problemSolving;

import java.util.Scanner;


//https://codeforces.com/contest/265/problem/A
public class ColorfulStones {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstString = scan.next();
        String secondString = scan.next();
        int pointer = 1;
        int indexOfFirstString = 0;
        for (int i = 0; i < secondString.length(); i++) {

            if(firstString.toCharArray()[indexOfFirstString]==secondString.toCharArray()[i]){
                pointer++;
                indexOfFirstString++;
            }

        }

        System.out.println(pointer);

    }
}


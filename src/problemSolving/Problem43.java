package problemSolving;

import java.util.Scanner;

public class Problem43 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Long a = scanner.nextLong();
        Long b = scanner.nextLong();
        Long ab = scanner.nextLong();

        Long result = Math.abs(a-b);
        Long output = a+b+ab*2;
        if (result<=1){
            System.out.println(output);
        }else if (result>1){
            System.out.println(output-result+1);
        }

    }



}

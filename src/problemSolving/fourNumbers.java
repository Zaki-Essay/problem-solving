package problemSolving;

import java.util.Scanner;

//problem : https://codeforces.com/group/ndZ5Fwlwj8/contest/311256/problem/A
public class fourNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();

        Long prod = (long)number1*number2*number3*number4;
        System.out.println(prod);
    }

}

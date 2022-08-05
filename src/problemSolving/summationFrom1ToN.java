package problemSolving;


import java.util.Scanner;

//problem : https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/G
public class summationFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();;
        long sum = (long) number*(number+1)/2;
        System.out.println(sum);

    }
}

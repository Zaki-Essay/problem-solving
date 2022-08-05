package problemSolving;


import java.util.Scanner;

// problem : https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/V?fbclid=IwAR358kM296mAyVlRMjFMB0LD5m13ZHUa_U3EJb4QnNBbNIeYDvleu8DXdC8
public class PumProblem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int i=1;
        int help = 1;
        while (i<=inputNumber){

            System.out.println(help+" "+(++help)+" "+(++help)+" PUM");
            help+=2;
            i++;
        }

    }
}

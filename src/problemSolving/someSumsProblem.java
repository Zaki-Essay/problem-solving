package problemSolving;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

//https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/U

public class someSumsProblem {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int lastNumber = scanner.nextInt();
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        int count = 1,sum=0;
        while(count<=lastNumber){
            int newNumber = count;
            int result = 0;
            while (newNumber>=10){
                result+=newNumber%10;
                newNumber/=10;
            }
            result+=newNumber;
            if (result<=max&&result>=min){
                //System.out.println(result);
               // System.out.println(count);
                sum+=count;
            }




            count++;

        }
        System.out.println(sum);


    }
}

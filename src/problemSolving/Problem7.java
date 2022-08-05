package problemSolving;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem7 {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int number = scan.nextInt();

        while(number>0){
            int sum = 0;
            int min = scan.nextInt();
            int max = scan.nextInt();

            if(max<min){
                int temp = max;
                max = min;
                min = temp;
            }


            for (int i = min+1; i <max ; i++) {

                if(i%2!=0){
                    sum+=i;
                }

            }
            list.add(sum);
            number--;

        }

        list.forEach(System.out::println);


    }
}

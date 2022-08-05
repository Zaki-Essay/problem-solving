package problemSolving;

//problem : https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/S

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumOfConsecutiveOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sumList = new ArrayList<>();
        int numberOfEssay = scanner.nextInt();
        int index = 1;
        while(index<=numberOfEssay) {
            int numberMax = scanner.nextInt();
            int numberMin = scanner.nextInt();

            //swapping two number
            if (numberMin > numberMax) {
                int temp = numberMin;
                numberMin = numberMax;
                numberMax = temp;
            }

            //or use Max and Min functions instead of swapping
            /*numberMax = Math.max(numberMax,numberMin);
            numberMin = Math.min(numberMax,numberMin);*/


            int sum = 0;
            for (int i = numberMin + 1; i < numberMax; i++) {
                if (i % 2 != 0) {
                    sum += i;

                }

            }
            sumList.add(sum);
            index++;
        }
        sumList.stream().forEach(System.out::println);


    }


}

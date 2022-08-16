package problemSolving;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem32 {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    Set<Integer> listOfUniqueNumber = new HashSet<>();

        for (int i = 0; i < 4; i++) {

            listOfUniqueNumber.add(scanner.nextInt());

        }

        System.out.println(4-listOfUniqueNumber.size());
    }
}



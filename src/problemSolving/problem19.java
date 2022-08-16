package problemSolving;

import java.util.Scanner;

public class problem19 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numberOfRoom = scanner.nextInt();
        int result = 0;
        while (numberOfRoom > 0) {
            int numberOfStudentInRoom = scanner.nextInt();
            int capacityOfRoom = scanner.nextInt();
            if (capacityOfRoom-numberOfStudentInRoom>=2){
                result++;
            }
            numberOfRoom--;


        }


        System.out.println(result);


    }
}

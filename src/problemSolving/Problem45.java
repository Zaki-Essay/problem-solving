package problemSolving;

import java.util.Scanner;

public class Problem45 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfEvents = scanner.nextInt();
        int result=0;
        int positive =0;
        for (int i = 0; i < numberOfEvents; i++) {
            int number = scanner.nextInt();
            if (number<0){
                if (positive==0){
                    result++;
                }else{
                    positive--;
                }
            }else{
                positive+=number;
            }


        }
        System.out.println(result);

    }
}

package problemSolving;

import java.util.Scanner;

public class Problem35 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {

            char[] chars = (scanner.next()).toCharArray();
            if (chars.length>10){
                System.out.println(chars[0]+""+(chars.length-2)+chars[chars.length-1]);
            }else{
                System.out.println(String.valueOf(chars));
            }

        }
    }
}

package problemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problem34 {


    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {

            String word = scanner.next();

            if (word.length()>10){
                list.add(word.charAt(0)+""+(word.length()-2)+""+word.charAt(word.length()-1));

            }else{
                list.add(word);
            }


        }

        for (String string : list) {
            System.out.println(string);
        }

    }
}

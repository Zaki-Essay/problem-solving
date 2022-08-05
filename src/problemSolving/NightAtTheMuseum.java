package problemSolving;

//https://codeforces.com/contest/731/problem/A

import java.util.List;
import java.util.Scanner;

public class NightAtTheMuseum {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String input = scan.next();


        int start = 97;
        int compteur = 0;




        for (int i = 0; i < input.length(); i++) {

            int car = input.toCharArray()[i];

            int result = Math.abs(car-start);

            if(result<=13){
                compteur+=result;
            }else {
                compteur+=26-result;

            }

            start = input.toCharArray()[i];




        }

        System.out.println(compteur);


    }
}

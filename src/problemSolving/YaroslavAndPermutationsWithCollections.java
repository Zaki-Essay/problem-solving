package problemSolving;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class YaroslavAndPermutationsWithCollections {



    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(scan.nextInt());
        }


        int frequency=0;
        int maxFrq=0;
        for (Integer integer : list) {
            frequency = Collections.frequency(list,integer);
            if (frequency>maxFrq){
                maxFrq=frequency;
            }
        }


        if (length%2==0){
            if (maxFrq<=length/2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            if(maxFrq<=length/2+1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }



    }


}

package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem31 {

    public static void main(String[] args){

        //sorting array with bul in function

        int[] array = {12,333,34,34,56};

        Arrays.sort(array);

        for (int i : array) {
            System.out.println(i);
        }

        int[] array1 = {123,3334,345,343,564};


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[i]<array1[j] && i!=j){
                    int temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;


                }
            }
        }
        System.out.println("----------------------------------");
        for (int i : array1) {
            System.out.println(i);
        }


        //sort list
    List<Integer> integerList = new ArrayList<>();

        integerList.add(2);
        integerList.add(5);
        integerList.add(1);
        integerList.add(9);

        integerList.sort((a,b)->a>b?a:b);

        integerList.forEach(System.out::println);
    }
}

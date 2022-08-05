package problemSolving;

import java.util.*;

public class YaroslavAndPermutations {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {

            array[i] = scan.nextInt();

        }

        System.out.println(evalArray(array));


    }

    public static String evalArray(int[] arr){


        //[1,1,6,7]2<=2
        //[1,1,4,4,4]3<=3

        String result = "";
        int maxOcc = maxFreInArray(arr);
        if(arr.length%2==0){//even
            if (maxOcc<=arr.length/2){
                result = "YES";
            }else{
                result="NO";
            }
        }else{
            if (maxOcc<=arr.length/2+1){
                result = "YES";
            }else{
                result="NO";
            }
        }


        return result;

    }


    //solution with array
    public static int maxFreInArray(int[] arr){


        int occ = 0;


        for (int i = 0; i < arr.length; i++) {
            int pointer=0;
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    pointer++;
                }
            }
            if (pointer>occ){
                occ = pointer;
            }
        }

        return occ;


    }




}

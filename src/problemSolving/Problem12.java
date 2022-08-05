package problemSolving;

import java.util.Scanner;

public class Problem12 {


    public static void main(String args[]){

        //odd [11123] : yes 3<=5/2+1
        //even [1123] : no 2<=4/2


        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];


        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();

        }


        if (arr.length%2==0){

            if (MaxFrequency(arr)<=arr.length/2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        }else{


            if (MaxFrequency(arr)<=arr.length/2+1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }


    }


    public static int MaxFrequency(int arr[]){
        int frequency=0;

        for (int i = 0; i < arr.length; i++) {
            int count=0;

            for (int j = 0; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }

            }

            if (frequency<count){
                frequency=count;
            }
        }

        return frequency;
    }
}

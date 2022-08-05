package problemSolving;

import java.util.Scanner;

public class swapInArray {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);


        int[] array = {1,2,3,4,5,6,7};

        int element1 = scan.nextInt();
        int element2 = scan.nextInt();

        int indexForElement1 = getIndex(array,element1);

        int indexForElement2 = getIndex(array,element2);


        int temp = array[indexForElement1];
        array[indexForElement1] = array[indexForElement2];
        array[indexForElement2] = temp;


        for (int i : array) {
            System.out.println(i);
        }


    }


    public static  int getIndex(int[] arr,int element){
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==element){
                index = i;
            }
        }


        return index;
    }
}

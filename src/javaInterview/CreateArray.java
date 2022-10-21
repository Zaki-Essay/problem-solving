package javaInterview;

public class CreateArray {


    public static void main(String[] args){
        //create and instantiate an array

        int[] array = new int[3];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}

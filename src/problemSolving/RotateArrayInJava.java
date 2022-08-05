package problemSolving;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RotateArrayInJava {

    public static void main(String[] args) {

        //test of rotateArrayV1
        int[] testArray = {1,2,3,4,5};
        int counter = 3;

        rotateArrayV1(testArray,counter);


        System.out.println("first version ");
        for (int item :testArray
             ) {

            System.out.print(item+" ");

        }









        System.out.println("\nsecond version");

        int[] testArray2 = {3,4,5,6};

        rotateArrayV2(testArray2,counter);

        for (int i = 0; i < testArray2.length; i++) {

            System.out.print(testArray2[i]+" ");

        }











        System.out.println("\nthe 3d methode");

        int[] testArray4 = {1,2,3,4,5,6,7};



        rotateArrayV3(testArray4,counter);


        for (int item:testArray4
             ) {

            System.out.print(item+" ");

        }



        //rotate an array using Collections


        System.out.println("rotate array list using Collection interface");
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);


      Collections.rotate(list,3);

        System.out.println(list);





    }




    //the solution with space:O(n) complexity:O(n)
    public static void rotateArrayV1(int array[],int k){

        if(k>array.length){
            k= k%array.length;

        }

        int[] tempArray = new int[array.length];


        for (int i = 0; i < k; i++) {

            tempArray[i] = array[array.length-k+i];

        }


        int j=0;
        for (int i = k; i < array.length; i++) {

            tempArray[i] = array[j];
            j++;

        }


        System.arraycopy(tempArray,0,array,0,array.length);




    }


    //solution in space:O(1) complexity:O(n*k)
    public static void rotateArrayV2(int[] array,int pointer){

        if (pointer>array.length){
            pointer=pointer%array.length;

        }


        for (int i = 0; i < pointer; i++) {


            for (int j = array.length-1; j >0; j--) {

                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;

            }


        }



    }



    //this solution with complexity:O(n) space:O(1)
    public static void reverse(int[] array,int startIndex,int endIndex){

        if (array==null || array.length==1){
            return;
        }

        while(startIndex<endIndex){

            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;


        }


    }

    public static void rotateArrayV3(int[] array,int pointer){


        reverse(array,0,array.length-1-pointer);
        reverse(array,array.length-pointer, array.length-1);
        reverse(array,0,array.length-1);

    }



    //solution with array Lists

}

package problemSolving;


import java.util.Arrays;

public class rotateArray {



    public static void main(String args[]){


        int[] array = {1,2,3,4,5,6};//[1,2,3,4,5]


       rotateByReverse(array,2);

        //reverse(array,0,2);
        //reverse(array,3,5);
        //reverse(array,0,2);
        //reverse(array,0,5);



        for (int i : array) {
            System.out.print(i+" ");
        }




    }
    
    
    
    public static void rotateV1(int[] array,int count){

        //array[1,2,3,4,5,4,5] ,count=3 ||tempArray[5,4,5](0,2) array[1,2,3,4,5,4,5](4,6)|| tempArray[](3,6),array(0,3)


        int[] tempArray = new int[array.length];

        for (int i = array.length-count,j=0; i < array.length; i++,j++) {

            tempArray[j] = array[i];

        }


        for (int i = 0,j=count; i < array.length-count;j++, i++) {

            tempArray[j] = array[i];

        }
        System.arraycopy(tempArray,0,array,0,array.length);

    }


/*
* using bubble rotate
* */

    //[1,2,3,4,5] | count:3  ==>  1:[51234] 2:[45123]
    public static int[] rotateV2(int[] array,int count){


        for (int i = 0; i < count; i++) {

            for (int j = array.length-1; j >0 ; j--) {

                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;

            }

        }

        return array;
    }

    /*
    *
    * reverse method
    *
    * */
    //[1,2,3,4,5,6]  3,5
    public static void reverse(int[] array,int startIndex,int endIndex){



        for (int i = startIndex,j=endIndex; i <j ; i++,j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }

    }

    public static void rotateByReverse(int[] array,int counter){

        reverse(array,0,array.length-counter-1);
        reverse(array, array.length-counter, array.length-1);
        reverse(array, 0, array.length-1);


    }


    /*
    *
    *
    *
    * */

}
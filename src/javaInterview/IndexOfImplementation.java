package javaInterview;

public class IndexOfImplementation {



    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6};

        System.out.println(indexOf(array,5));


    }

    //simple solution O(n)
    public static int indexOf(int[] array,int element){



        for (int i = 0; i < array.length; i++) {

            if (array[i]==element){
                return i;
            }

        }
        return -1;
    }




}

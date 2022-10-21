package javaInterview;

import java.util.stream.IntStream;

public class DeleteElementInArray {


    public static void main(String[] args){
        //in this example we see how to delete all occ of an element in an array

        int[] array  = {1,2,3,2,3};

        int element=2;

        int[] newArray = IntStream.range(0,array.length).filter(i->array[i]!=element).map(i->array[i]).toArray();




    }
}

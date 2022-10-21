package javaInterview;

public class reverseArray {


    public static void main(String[] args){


        int[] array = {1,2,3,4,5,6,7,8,9};

        solution3(array,0,array.length-1);
        printArray(array);


    }

    // the naive solution with O(n) : time complexity ;O(n) space complexity
    public static int[] solution1(int[] array){

        if (array.length<2) return array;

        int[] helperArray = new int[array.length];
        for (int i=array.length-1,j=0 ; i>=0;i--,j++){


            helperArray[j]=array[i];


        }

        return helperArray;

    }


    //improved solution with O(n) time complexity
    //the iterative way
    //tow pointer problem
    public static int[] solution2(int[] array){
        if (array.length-1<2) return array;

        int temp =0;
        int pointerA=0;
        int pointerB=array.length-1;
        while(pointerA<pointerB){
            temp=array[pointerA];
            array[pointerA] = array[pointerB];
            array[pointerB] = temp;

            pointerA++;
            pointerB--;

        }

        return array;
    }


    //the recursive way

    public static void solution3(int[] array,int leftIndex,int rightIndex){

        if (leftIndex>rightIndex) return;

        int temp = array[leftIndex];
         array[leftIndex]=array[rightIndex];
         array[rightIndex] = temp;
         leftIndex++;
         rightIndex--;
         solution3(array,leftIndex,rightIndex);





    }

    public static void printArray(int[] array){

        System.out.print("[ ");
        for(int i=0;i<array.length;i++){
            System.out.print( array[i]+" ");
        }

        System.out.print(" ]");

    }
}

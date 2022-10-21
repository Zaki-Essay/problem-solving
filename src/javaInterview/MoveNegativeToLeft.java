package javaInterview;

public class MoveNegativeToLeft {
    public static void main(String[] args){
        int[] array = {1,2,3,4,6,5,-4,-5,-6,-3,-6};

        printArray(solution(array));


    }

    public static int[] solution(int[] array){
        int[] newArray = new int[array.length];

        int pointerA =0;
        int pointerB = array.length-1;

        for(int i=0;i<array.length;i++){

            if (array[i]<0){
                newArray[pointerA++] = array[i];
            }else{
                newArray[pointerB--] = array[i];
            }


        }

        return newArray;
    }

    public static void printArray(int[] array){

        for(int i=0;i<array.length;i++){

            System.out.print(array[i]+" ");

        }
    }


}

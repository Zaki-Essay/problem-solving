package javaInterview;

public class FindTheMessingNumber {


    public static void main(String[] args){

        int[] array = {1,2,3,4,5,7};
        System.out.println(solution(array,7));

    }


    public static int solution(int[] array,int largestNumber ){


        int expectedResult = (largestNumber*(largestNumber+1))/2;



        return expectedResult-sum(array);



    }

    public static int sum(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }

        return sum;
    }
}

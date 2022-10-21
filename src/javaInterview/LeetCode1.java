package javaInterview;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {

    //solution whit O(n^2)
    public static int[] towSum(int[] nums, int target){

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            for (int i1 = i+1; i1 < nums.length; i1++) {

                if (nums[i]+nums[i1]==target){


                    result[0] = i;
                    result[1] = i1;
                    break;


                }

            }

        }

        return result;


    }

    //solution whit O(n) time complexity
    public static int[] towSum2(int[] nums, int target){

        int[] result = new int[2];

        Map<Integer,Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {

            int tmp = target-nums[i];

            if (!map.containsKey(tmp)){
                map.put(nums[i],i);
            }else{
                result  = new int[]{map.get(tmp),i};
            }


        }


        return result;

    }
    // assume that the array is sorted , the solution with O(nlogn)
    // la recherche dichotomique puisque table is already sorted

    public static int[] towSum3(int[] array , int target){
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            int exist = dicSearch(array,i+1,target-array[i]);

            if (exist!=-1){
                result =  new int[]{i,exist};
            }

        }

        return result;




    }

    public static int dicSearch(int[] array, int startIndex,int element){
       int endIndex = array.length-1;
       int result=-1;

       while (startIndex<=endIndex){
           int mid = (startIndex+endIndex)/2;

           if (element<array[mid]){
               endIndex=mid -1;

           }else if (element>array[mid]){

               startIndex=mid+1;

           }else {
               result = mid;
               break;
           }

       }

       return  result;

    }



    //solution if the array is sorted with O(n) time complexty

    public static int[] sumTow4(int[] array , int target){
        int[] result = {-1,-1};

        int i = 0,j=array.length-1;
        while ( i < j) {

            int sum = array[i]+array[j];
            if (sum>target){
                j--;
            }else if (sum<target){
                i++;

            }else{
                result = new int[]{i,j};
                break;
            }


        }




        return result;



    }





    public static void main(String args[]){

        int[] array = {1,2,3,4,7};


        showArray(sumTow4(array,6));

    }



    public static void showArray(int[] array){

        System.out.print("[ ");
        for (int i : array) {
            System.out.print(i+" ");
        }

        System.out.println("]");
    }


}

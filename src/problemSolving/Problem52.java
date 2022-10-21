package problemSolving;

import java.util.Scanner;

public class Problem52 {


    public static void main(String[] args){


        int[] arr = {1,2,3,4,5,6};



twoSum(arr,9);






    }

    public static int[] twoSum(int[] numbers,int target){
        for (int i = 0; i < numbers.length; i++) {
            int j = binarySearchIterative(numbers,i+1,target-numbers[i]);
            if (j != -1) {
                return new int[] { i + 1, j + 1 };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }



    public static int binarySearchRecursive(int[] arr,int item,int left,int right){



        if (left<=right){
            int mid = (left+right)/2;

            if (arr[mid]==item){
                return mid;
            }


            if (arr[mid]>item){
               return binarySearchRecursive(arr,item,left,mid-1);
            }



            if (arr[mid]<item){
               return binarySearchRecursive(arr,item,mid+1,right);
            }




        }

        return -1;

    }


    public static int binarySearchIterative(int[] arr,int start,int item){



        int left = start;
        int right = arr.length-1;

        while (right>left){
            int mid = (left+right)/2;
            if (item>arr[mid]){
                left = mid+1;
            }else{
                right = mid;
            }
        }

        return (left==right && arr[left]==item)?left:-1;




    }




}

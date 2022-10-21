package problemSolving;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        int sum=0;
        int i=0;
        int j=0;
        while(true){
            if(sum<s && i<n){
                sum+=arr[i];
                i++;
            }else if(sum>s){
                sum-=arr[j];
                j++;
            }else if(sum==s){

                break;
            }

            if(sum<=s && i==n-1) break;

        }
        System.out.println(sum);
        ArrayList<Integer> list = new ArrayList<>();
        if(i==n-1 && j==0){
            list.add(-1);
        }else{
            list.add(j+1);
            list.add(i);
        }

        return list;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(subarraySum(arr,n,s));
    }
}



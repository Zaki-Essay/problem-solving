package javaInterview;

import java.util.HashMap;
import java.util.Map;

public class TowSum {


    public static int[] solution1(int[] array, int target){
        int[] nums = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {

                if (array[i]+array[j]==target){
                    nums[0] = i;
                    nums[1] = j;
                }

            }
        }

        return nums;
    }

    public static int[] solution2(int[] array,int target){
        Map<Integer,Integer> map = new HashMap<>();
        int[] nums=new int[2];
        for (int i = 0; i < array.length; i++) {
            int temp = target-array[i];
            if (!map.containsKey(temp)){
                map.put(array[i],i);
            }else{

                nums = new int[]{i,map.get(target- array[i])};
                break;
            }
        }

        return nums;
    }

    public static void main(String[] args){


        int[] array = {2,0,99,78,45,7,45,11,15};
        int target = 9;

        int[] nums = solution1(array,target);

        for (int num : nums) {
            System.out.println(num);
        }
    }
}

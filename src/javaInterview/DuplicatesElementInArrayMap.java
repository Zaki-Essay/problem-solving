package javaInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesElementInArrayMap {

    public static void solution(int[] array){
        Map<Integer,Integer> map =new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])){
                map.put(array[i],1);

            }else{
                map.put(array[i],map.get(array[i])+1);
            }
        }
        Set<Integer> set = map.keySet();
        System.out.println("the dplucate element element are : ");
        for (Integer a : set){
            if (map.get(a)>1){
                System.out.print(a+" ");
            }
        }



    }

    public static void main(String[] args){

        int[] array ={1,2,3,45,6,1,2,3,24,89,0};

        solution(array);

    }


}

package javaInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PresentInTowArray {


    public static void main(String[] args){

        int[] a = {1,2,3,4,1,6};

        int[] b = {3,4,5,6,3,8,9};

        int[] c = {6,7,8,9,10,6,11,12};

        Map<Integer,Integer> map = new HashMap<>() ;

        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])){
                map.put(a[i],1);
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (!map.containsKey(b[i])){
                map.put(b[i],1);
            }else{
                map.put(b[i], map.get(b[i])+1);
            }
        }


        for (int i = 0; i < c.length; i++) {
            if (!map.containsKey(c[i])){
                map.put(c[i],1);
            }else{
                map.put(c[i], map.get(c[i])+1);
            }
        }


        System.out.println(map);

        Set<Integer> set = map.keySet();
        //list.toArray()
        System.out.print("[ ");
        for (Integer integer : set) {
            if (map.get(integer)>1){
                System.out.print(integer+" ");
            }
        }
        System.out.print(" ]");




    }



}

package javaInterview;


import java.util.ArrayList;
import java.util.List;

class TowSumType{


    private List<Integer> array = new ArrayList<>();


    public void add(int item){
        array.add(item);
    }


    public boolean find(int target){

        for (int i = 0; i < array.size(); i++) {
            for (int j = i+1; j <array.size(); j++) {
                if (array.get(i)+array.get(j)==target){
                    return true;
                }
            }
        }


        return false;
    }







}


public class TowSumDataStructor {



    public static void main(String[] args){


        TowSumType towSumType =new TowSumType();

        towSumType.add(1);
        towSumType.add(34);
        towSumType.add(145);
        towSumType.add(2);
        towSumType.add(451);
        towSumType.add(14);
        towSumType.add(21);
        towSumType.add(7);

        System.out.println(towSumType.find(9));

    }
}

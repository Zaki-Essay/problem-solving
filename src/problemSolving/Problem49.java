package problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem49 {

    public static List<Integer> filterDuplicate(List<Integer> data){


        List<Integer> resultArray = new ArrayList<>();
        for (int i = 0,j=0; i < data.size(); i++) {

            if (!isExist(resultArray,data.get(i))){
                resultArray.add(data.get(i));

            }

        }

        return resultArray;
    }

    public static boolean isExist(List<Integer> array,int item){

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)==item){
                return true;

            }
        }
        return false;
    }






    public static void main(String[] args){
        List<Integer> array = List.of(1,2,3,4,5,1,1,11,1,1,1,11,1,11,1,1,1,1,1,1,11,1,4,6,7,3,2,1,4,2);
        array = filterDuplicate(array);

        for (int i : array) {
            System.out.println(i);
        }






    }
}

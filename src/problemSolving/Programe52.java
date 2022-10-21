package problemSolving;

public class Programe52 {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7};

        int target = 9;

        int[] ints = twoSum(arr, target);

        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] twoSum(int[] numbers,int target){

        int i = 0;
        int j = numbers.length-1;
        while(i<j){

            if (numbers[i]+numbers[j]>target){
                j--;
            }else if (numbers[i]+numbers[j]<target){
                i++;
            }else{
                return new int[]{i+1,j+1};
            }



        }
        throw new IllegalArgumentException("No two sum solution");
    }

}

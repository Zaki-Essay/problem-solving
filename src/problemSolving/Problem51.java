package problemSolving;

public class Problem51 {


    public static void main(String[] args){

        int[] arr1 = {2,7,11,15};
        int tar1 = 9;

        int[] a = twoSum(arr1,tar1);

        for (int ab:
             a) {
            System.out.println(ab);
        }


    }


    public static int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (j!=i && nums[i]+nums[j]==target){
                    if (i<j){
                        arr[0] = i;
                        arr[j] = j;
                    }else{
                        arr[0] = j;
                        arr[1]= i;
                    }
                }
            }
        }


        return arr;

    }
}

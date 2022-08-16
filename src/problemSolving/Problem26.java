package problemSolving;

public class Problem26 {

    public static void main(String[] args){
            //0, 1, 1, 2, 3, 5, 8, 13, 21

        System.out.println(fibonacciWithRecursion(8));
    }


    //fibonacci using for loop

    public static int fibonacciWithForLoop(int number){

        int a =0;
        int b = 1;
        int c = 1;
        if (number==0||number==1){
            return number;
        }
        for (int i = 2; i <= number ; i++) {
          a=b;
          b=c;
          c=a+b;
        }
        return c;

    }


    //fibonacci with dynamic programming

    public static int fibonacciWithDynamic(int number){
        if (number==0 || number==1){
            return number;
        }

        int[] array = new int[number+1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;

        for (int i = 2; i <=number ; i++) {
            array[i] = array[i-1]+array[i-2];
        }

        return array[number];
    }

    //fibonacci with recursion

    public static int fibonacciWithRecursion(int number){

        if (number<=1){
            return number;
        }else{
            return fibonacciWithRecursion(number-1)+fibonacciWithRecursion(number-2);
        }

    }
}

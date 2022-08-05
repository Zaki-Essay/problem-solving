package problemSolving;

public class evenOddNumber {
    public static void main(String[] args) {

        int result=1;
        for (int i = 1; i <= 20; i++) {
            if (i%2!=0) result *=i;
        }

        System.out.println("the multiplication of odd numbers from 1 to 20 is "+result);

        result=0;
        for (int i = 1; i <= 100; i++) {
            if   (i%2==0){
                    result+=i;
            }
        }

        System.out.println("the some of even number from 1 to 100 is "+result);


    }
}

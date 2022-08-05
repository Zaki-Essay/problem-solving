package problemSolving;

public class shapes {
    public static void main(String args[]){


        System.out.println("\nshape 1\n");
            shape1();



        System.out.println("\nshape 2\n");

            shape2();

            System.out.println("\nshape 2\n");

            shape3();

            System.out.println("\nshape 2\n");

            shape4(5,8);




    }



    public static void shape2(){

        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <=6-i ; j++) {
                System.out.print(j);
            }

            for (int j = 6-i; j <6 ; j++) {
                System.out.print("&");
            }

            System.out.println();
        }
    }


    public static void shape1(){
        for (int i = 1; i <=6 ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(j);

            }

            for (int j = i+1; j <= 6; j++) {

                System.out.print("*");

            }
            System.out.println();


        }
    }


    public static void shape3(){
        for (int i = 1; i <=6; i++) {
            for (int j = 1; j <= i; j++) {

                if(i==j | j==1 | i==1  |i==6)
                System.out.print("@");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void shape4(int height,int width){

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("B");
            }
            System.out.println();
        }





    }
}

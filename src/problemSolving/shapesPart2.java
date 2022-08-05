package problemSolving;

public class shapesPart2 {


    public static void main(String args[]){
            shape3(7,false);

    }

    public static void shape1(){

        for (int i = 1; i <=7; i++) {

            for (int j = 1; j <=7-i ; j++) {
                System.out.print(" ");
            }

            for (int j = 7-i+1; j <=7+i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }


    public static void shape2( int numberOfLines,boolean printLastLine){
        for (int i = 1; i <=numberOfLines; i++) {

            for (int j = 1; j <=numberOfLines-i ; j++) {
                System.out.print(" ");
            }

            for (int j = numberOfLines-i+1; j <=numberOfLines; j++) {
                if(i+j==8 || j==7 || (i==7&&printLastLine))
                System.out.print("# ");
                else
                    System.out.print("  ");

            }

            System.out.println();
        }

    }
    public static void shape3(int numberOfLinges,boolean printLastLine){

        for (int i = 1; i <= numberOfLinges; i++) {

            for (int j = 1; j <=numberOfLinges ; j++) {

                if(i+j==5 | i+j==11 | (i==2&&j==5) |(i==3&&j==6) |(i==5&&j==2) |(i==6&&j==3) )
                System.out.print("# ");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }


    }





}




package problemSolving;

import java.util.Scanner;

public class Problem14 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String string = scan.next();
        String stringToScale = scan.next();

        String[] leftAndRight = new String[2];
        String[] helpArray = string.split("\\|");

        if(helpArray.length==1){
            leftAndRight[0] = helpArray[0];
            leftAndRight[1] = "";
        }else{
            leftAndRight[0] = helpArray[0];
            leftAndRight[1] = helpArray[1];
        }

        String left = leftAndRight[0];
        String right = leftAndRight[1];


        if(left.length()>right.length()){
            if(right.length()+stringToScale.length()==left.length()){


                leftAndRight[1] = right+stringToScale;
                string = leftAndRight[0]+"|"+leftAndRight[1];
                System.out.println(string);

            }else{
                System.out.println("Impossible");
            }


        }else if(right.length()>left.length()){

            if(left.length()+stringToScale.length()==right.length()){
                    leftAndRight[0] = left+stringToScale;
                string = leftAndRight[0]+"|"+leftAndRight[1];
                System.out.println(string);
            }else{
                System.out.println("Impossible");
            }

        }else{
            System.out.println("Impossible");
        }



    }

}

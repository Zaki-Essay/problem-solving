package problemSolving;

import java.util.Scanner;

public class Problem13 {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int leftHand = scan.nextInt();
        int rightHand = scan.nextInt();
        int  bothHand = scan.nextInt();

      while(bothHand!=0){

          if(leftHand<rightHand){
              leftHand++;
              bothHand--;
          }else if(rightHand<leftHand){
              rightHand++;
              bothHand--;
          }else {
              if (bothHand>=2){
                  rightHand++;
                  leftHand++;
                  bothHand=bothHand-2;
              }else break;

          }

        }
        if(leftHand==0 || rightHand==0){
            System.out.println(0);
        }else if(leftHand>rightHand){
            System.out.println(2*rightHand);
        }else if(rightHand>leftHand){
            System.out.println(2*leftHand);
        }else if(rightHand==leftHand){

            System.out.println(2*leftHand);

        }


    }
}

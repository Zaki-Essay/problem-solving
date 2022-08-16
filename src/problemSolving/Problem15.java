package problemSolving;

import java.util.Scanner;

public class Problem15 {

    //https://www.youtube.com/watch?v=DgQmMpVc300&list=PLq8huKQsVgUNeY54z4462W1IQGCuEy86V&index=20
    ////https://codeforces.com/contest/382/problem/A
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);


            String stringToScale = scan.next();
            String stringForScales = scan.next();


            String[] strings = stringToScale.split("\\|");
            String left="";
            String right="";

            if (strings.length==1){
                 left  = strings[0];

            }else if(strings.length>1) {
                 left  = strings[0];
                 right = strings[1];

            }
            int i = 0;

            int stringLength =stringForScales.length();
            while(stringLength>0){
                if (left.length()<right.length()){
                    left+=stringForScales.charAt(i);
                    i++;
                    stringLength--;

                }else if(left.length()>right.length()){
                    right+=stringForScales.charAt(i);
                    i++;
                    stringLength--;


                }else{

                    if (stringLength>=2){

                       left+=stringForScales.charAt(i);
                        i++;
                       right+=stringForScales.charAt(i);
                       i++;
                       stringLength-=2;






                    }else{
                        System.out.println("Impossible");
                        return;
                    }

                }




            }

            if (left.length()==right.length()){
                System.out.println(left+"|"+right);
            }else{
                System.out.println("Impossible");
            }
        }




}

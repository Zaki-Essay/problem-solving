package problemSolving;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Problem33 {

    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);

        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string ="ABC";

        int A=0,B=0,C=0;

        if (string1.charAt(1)=='>'){
            if (string1.charAt(0)=='A'){
                A++;
            }else if(string1.charAt(0)=='B'){
                B++;
            }else if (string1.charAt(0)=='C'){
                C++;
            }
        }else if (string1.charAt(1)=='<'){

            if (string1.charAt(2)=='A'){
                A++;
            }else if(string1.charAt(2)=='B'){
                B++;
            }else if (string1.charAt(2)=='C'){
                C++;
            }

        }


        if (string2.charAt(1)=='>'){
            if (string2.charAt(0)=='A'){
                A++;
            }else if(string2.charAt(0)=='B'){
                B++;
            }else if (string2.charAt(0)=='C'){
                C++;
            }
        }else if (string2.charAt(1)=='<'){

            if (string2.charAt(2)=='A'){
                A++;
            }else if(string2.charAt(2)=='B'){
                B++;
            }else if (string2.charAt(2)=='C'){
                C++;
            }

        }

        if (string3.charAt(1)=='>'){
            if (string3.charAt(0)=='A'){
                A++;
            }else if(string3.charAt(0)=='B'){
                B++;
            }else if (string3.charAt(0)=='C'){
                C++;
            }
        }else if (string3.charAt(1)=='<'){

            if (string3.charAt(2)=='A'){
                A++;
            }else if(string3.charAt(2)=='B'){
                B++;
            }else if (string3.charAt(2)=='C'){
                C++;
            }

        }

       // System.out.println(A+" "+B+" "+C);
        if (A!=B && B!=C){
            char[] list = new char[3];
            list[A] = 'A';
            list[B] = 'B';
            list[C] = 'C';

            System.out.println(String.valueOf(list));



        }else{
            System.out.println("Impossible");
        }



    }


}

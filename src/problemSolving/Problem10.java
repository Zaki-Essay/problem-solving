package problemSolving;

import java.util.Scanner;

public class Problem10 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        String firstString = scan.next();
        String secondString = scan.next();

        char[] firstStringArray = firstString.toCharArray();
        char[] secondStringArray = secondString.toCharArray();

        int count=1,i=0,j=0;

        while(j<secondStringArray.length){

            if (firstStringArray[i]==secondStringArray[j]){
                count++;
                j++;
                i++;
            }else{
                j++;
            }

        }


        System.out.println(count);
    }

}

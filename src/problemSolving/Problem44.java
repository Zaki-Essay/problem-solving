package problemSolving;

import java.util.Scanner;

public class Problem44 {


    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();


        int numberOfDom = 0;
        for (int i = 0; i < m; i+=2) {
           int j=0;
           while(j<n){
               if (i<m-1){
                   numberOfDom++;
                   j++;
               }else if(i==m-1 && j!=n-1){
                   j+=2;
                   numberOfDom++;
               }else{
                   j++;
               }
               //System.out.println( numberOfDom);
           }

        }

        System.out.println(numberOfDom);
    }
}

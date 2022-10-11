package problemSolving;

import java.util.Scanner;

public class Problem47 {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int length = scanner.nextInt();
        String string = scanner.next();
        String text="";
        int i=0;

        while(i<string.length()){
            if (length%2==0){
                text = string.charAt(i)+text;
            }else{
                text = text+ string.charAt(i);

            }

            i++;
            length--;
        }

        System.out.println(text);
    }
}

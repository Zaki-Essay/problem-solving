package problemSolving;

import java.util.Scanner;

public class Problem28 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        boolean flag=true;
        for (int i = 0,j=string.length()-1; i < j; i++,j--) {
            if (string.charAt(i)!=string.charAt(j)){
                flag=false;
                break;
            }
        }

        if (flag){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}

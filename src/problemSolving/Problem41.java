package problemSolving;

import java.util.Scanner;
import java.util.Stack;

public class Problem41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.next().split("");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < list.length; i++) {

            if (stack.size()==0){
                stack.push(list[i]);
            }else{
                if (stack.lastElement().equals("(") && list[i].equals(")")){
                    stack.pop();
                }else{
                    stack.push(list[i]);
                }
            }
           // System.out.println(stack);
        }

        System.out.print(list.length-stack.size());
    }
}

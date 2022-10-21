package javaInterview;

import java.util.HashSet;
import java.util.Stack;

public class Prefix {


        public static boolean para(String s){

            if (s.length()<=1) return false;
            Stack<Character> stack = new Stack<>();


            for (int i = 0; i < s.length(); i++) {
                if (stack.isEmpty()){
                    stack.push(s.charAt(i));
                }else{

                    //'(', ')', '{', '}', '[' and ']
                    char cara = stack.peek();

                    if ((cara=='(' && s.charAt(i)==')' ) || (cara=='{' && s.charAt(i)=='}') || (cara=='[' && s.charAt(i)==']')){

                        stack.pop();

                    }else{
                        stack.push(s.charAt(i));
                    }

                }

            }

            return stack.size() == 0;

        }

        public static void main(String[] args){

            String string = "(])";

            System.out.println(para(string));

        }
}

package problemSolving;

import java.util.Stack;

public class PolishNotion {



        public static void main(String[] args){

            String[] array = {"2","1","+","3","*"};



            System.out.println(evaluate(array));


        }

        public static int evaluate(String[] arr){
            String operator = "+*/-";
            Stack<String> stack = new Stack<>();

            for (String s : arr) {

                if (operator.contains(s)){

                    int number2 = Integer.parseInt(stack.pop());
                    int number1 = Integer.parseInt(stack.pop());

                    switch (s) {
                        case "+" -> stack.push(String.valueOf(number1 + number2));
                        case "-" -> stack.push(String.valueOf(number1 - number2));
                        case "*" -> stack.push(String.valueOf(number1 * number2));
                        case "/" -> stack.push(String.valueOf(number1 / number2));
                    }

                }else{
                    stack.push(s);

                }




            }

            return Integer.parseInt(stack.pop());
        }
}

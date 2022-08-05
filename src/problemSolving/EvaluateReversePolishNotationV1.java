package problemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EvaluateReversePolishNotationV1 {

    public static void main(String[] args) {


        List<String> listTest = new ArrayList<>();
        listTest.add("4");
        listTest.add("3");
        listTest.add("5");
        listTest.add("/");
        listTest.add("+");

        System.out.println(evaluate(listTest));

    }

    public static int evaluate(List<String> array){


        Stack<Integer> stack = new Stack<>();

        array.forEach((item)->{

            int number1,number2;

            switch (item){
                case "0" : stack.push(0);
                    break;
                case "1" :stack.push(1);
                    break;
                case "2" :stack.push(2);
                    break;
                case "3" :stack.push(3);
                    break;
                case "4" :stack.push(4);
                    break;
                case "5" :stack.push(5);
                    break;
                case "6" :stack.push(6);
                    break;
                case "7" :stack.push(7);
                    break;
                case "8" :stack.push(8);
                    break;
                case "9" :stack.push(9);
                    break;
                case "+" :
                    number1 = stack.pop();
                    number2 = stack.pop();
                    stack.push(number1+number2);

                    break;
                case "-" :
                    number1 = stack.pop();
                    number2 = stack.pop();
                    stack.push(number1-number2);
                    break;
                case "*" :
                     number1 = stack.pop();
                     number2 = stack.pop();
                    stack.push(number1*number2);
                    break;
                case "/" :
                     number1 = stack.pop();
                     number2 = stack.pop();
                    stack.push(number1/number2);
                    break;

            }


        });

        return stack.pop();
    }
}




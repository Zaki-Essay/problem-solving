package problemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EvaluateReversePolishNotationV2 {


    public static void main(String[] args) {
        List<String> listTest = new ArrayList<>();
        listTest.add("4");
        listTest.add("13");
        listTest.add("5");
        listTest.add("/");
        listTest.add("+");

        System.out.println(evaluateExp(listTest));
    }

    public static int evaluateExp(List<String> array){



        String operations = "+-/*";

        Stack<String> stack = new Stack<>();

        array.forEach(item->{

            if (operations.contains(item)){
                int number2 = Integer.parseInt(stack.pop());
                int number1 = Integer.parseInt(stack.pop());

                switch (item){
                    case "+":
                        stack.push(String.valueOf(number1+number2));
                        break;
                    case "-":
                        stack.push(String.valueOf(number1-number2));
                        break;
                    case "*":
                        stack.push(String.valueOf(number1*number2));
                        break;
                    case "/":
                        stack.push(String.valueOf(number1/number2));
                        break;


                }

            }else {
                stack.push(item);
            }




        });

        return Integer.valueOf(stack.get(0));




    }


}


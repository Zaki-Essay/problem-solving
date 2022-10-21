package javaInterview;


import java.util.HashMap;
import java.util.Map;

public class tecnicalTest {

    public static String solution(String str){

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=' ' && str.charAt(i)!='-'){
                stringBuilder.append(str.charAt(i));
            }
        }

        StringBuilder result= new StringBuilder();
            int count =0;
            for (int j = 0; j < stringBuilder.length(); j++) {

                if (count==3){
                    result.append("-");
                    result.append(stringBuilder.charAt(j));
                    count=1;
                }else{
                    result.append(stringBuilder.charAt(j));
                    count++;
                }



            }
            return result.toString();


    }

    public static void main(String[] args){
        String string = "23- 4332-234";

        System.out.println(solution(string));
    }
}

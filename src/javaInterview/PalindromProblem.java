package javaInterview;

import java.util.Locale;

public class PalindromProblem {


    public static boolean isPalindrome2(String string){

        int i=0,j=string.length()-1;

        while(i<j){
            while (!Character.isLetterOrDigit(string.charAt(i)))i++;
            while (!Character.isLetterOrDigit(string.charAt(j)))j--;

            if (Character.toLowerCase(string.charAt(i))!=Character.toLowerCase(string.charAt(j))) return false;

            i++;
            j--;

        }

        return true;


    }



    public static boolean isPalindrome(String s){

        s=s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length();  i++) {
            if ((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0'&& s.charAt(i)<='9')){
                stringBuilder.append(s.charAt(i));
            }
        }

        for (int i = 0,j=stringBuilder.length()-1; i < j;j--, i++) {
            if (stringBuilder.charAt(i)!=stringBuilder.charAt(j)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        String s = "race a car";

        System.out.println(isPalindrome2(s));
    }
}

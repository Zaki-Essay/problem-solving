package javaInterview;

public class ReverseString {

    public static char[] reverseWords(char[] s) {

        for (int i = 0,j=s.length-1; i < s.length/2;j--, i++) {


            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }

        return s;
    }
    public static void main(String[] args){


        char[] array = {'h','l','l','o'};
        array =  reverseWords(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



    }
}

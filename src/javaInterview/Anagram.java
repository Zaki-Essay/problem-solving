package javaInterview;

public class Anagram {


    public static void main(String[] args){


        String s= "anagram", t = "nagaram";

        System.out.println(isAnagram(s,t));

    }

    public static boolean isAnagram(String str1,String str2){
        if (str1.length()!=str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (numberOcc(str1,str1.charAt(i))!=numberOcc(str2,str1.charAt(i)) || numberOcc(str1,str2.charAt(i))!=numberOcc(str2,str2.charAt(i))){
                return false;
            }
        }

        return true;
    }
    public static int numberOcc(String s,char chara){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==chara){
                count++;
            }
        }

        return count;
    }
}

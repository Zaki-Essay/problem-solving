package javaInterview;

public class Solution {
    public static String longestPalindrome(String s) {
        if(s.length() < 1 || s==null ) return "";

        int startIndex =0;
        int endIndex = 0;


        for(int i=0;i<s.length();i++){
            int len1 = expandString(s,i,i);
            int len2  = expandString(s,i,i+1);

            int len  = Math.max(len1,len2);

            if(len>startIndex-endIndex){
                startIndex = i-((len-1)/2);
                endIndex = i+(len/2);

            }
        }

        return s.substring(startIndex,endIndex+1);


    }

    public static int expandString(String s,int startIndex,int endIndex){
        if(s==null || startIndex>endIndex) return 0;
        while(startIndex>=0 && endIndex<s.length() && s.charAt(startIndex)==s.charAt(endIndex)){

            startIndex--;
            endIndex++;



        }

        return startIndex-endIndex-1;


    }

    public static void main(String[] args){

        String s = "babad";

        System.out.println(longestPalindrome(s));


    }
}
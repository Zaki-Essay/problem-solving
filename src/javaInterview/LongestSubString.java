package javaInterview;

public class LongestSubString {


    public static String solution(String s){

        if (s.length()==0 || s==null){
            return "";
        }

        int startIndex =0;
        int endIndex=0;


        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s,i,i);
            int len2 = expand(s,i,i+1);
            int len = Math.max(len1,len2);


            if (len>endIndex-startIndex){
                startIndex = i-((len-1)/2);
                endIndex = i+len/2;
            }


        }

        return s.substring(startIndex,endIndex+1);

    }


    public static int expand(String s, int startIndex,int endIndex ){

        if (s.length()==0) return 0;

        int result=0;

        while(startIndex>=0 && endIndex<=s.length()-1 && s.charAt(startIndex)==s.charAt(endIndex) ){

                startIndex--;
                endIndex++;



        }

        return endIndex-startIndex-1;

    }


    public static void main(String[] args){

        String s = "xxxxzzxx";

        System.out.println(solution(s));

    }
}

package javaInterview;

public class StrstrProblem {


    public static int strStr(String haystack, String needle) {

        if (haystack.length()<needle.length()) return -1;


        for (int i = 0; i < haystack.length(); i++) {
            int j=0;
            int count=0;
            if (haystack.charAt(i)==needle.charAt(j)){
                int l=i+1;
                count =1;
                for (int k = 1; k < needle.length() && l<haystack.length(); k++) {
                    if (needle.charAt(k)==haystack.charAt(l)){
                        l++;
                        count++;
                    }else break;
                }
            }

            if (count==needle.length()){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args){


        System.out.println(strStr("mississippi","issipi"));
    }
}

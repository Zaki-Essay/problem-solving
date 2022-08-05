package problemSolving;

public class PalindromicSubstringNaiveApproach {


    public static void main(String[] args) {


        System.out.println(longestPalindromicSub("ABAD"));

    }


public static int longestPalindromicSub(String str){
    int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {


            for (int j = i+1; j < str.length(); j++) {

                String subString = str.substring(i,j+1);
                int lengthOfSub = j-i+1;

                if(isPalindromic(subString)){

                    if(lengthOfSub>maxLength){
                        maxLength = lengthOfSub;

                    }
                }



            }



        }

        return maxLength;

}

//check a string is palindromic
    public static boolean isPalindromic(String str){

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }


        }

        return true;
    }
}






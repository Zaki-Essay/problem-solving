package problemSolving;

public class PalindromicSubstringDynamicProgrammingApproach {


    public static void main(String args[]){
        longestPalindromic("ABBACMAAlAAM");
    }

    public static String longestPalindromic(String str){


        if (str==null)
            return null;

        if(str.length()<=1)
            return str;


        String string=null;
        int maxLength = 0;

        //first step:
        int[][] array = new int[str.length()][str.length()];


        for (int i = 0; i < str.length(); i++) {

            array[i][i] = 1;

        }


        //step 2
        for (int i = 0; i < str.length()-1; i++) {

            if (str.charAt(i)==str.charAt(i+1)){
                array[i][i+1] = 1;
                string = str.substring(i,i+2);
                maxLength = 2;
            }

        }



        //step 3

        for (int k = 3; k < str.length() ; k++) {

            for (int i = 0; i < str.length()-k; i++) {

                int j = k+i-1;

                if (str.charAt(i)==str.charAt(j)){
                    array[i][j] = array[i+1][j-1];

                    if(array[i][j]==1 && maxLength<k){

                        string = str.substring(i,j+1);
                        maxLength = k;
                    }
                }



            }

        }

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt+"  ");
            }
            System.out.println();
        }

        System.out.println(string);
        System.out.println(maxLength);


        return null;

    }
}
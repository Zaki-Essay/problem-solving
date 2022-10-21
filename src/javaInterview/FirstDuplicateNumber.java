package javaInterview;

public class FirstDuplicateNumber {



    public static void main(String[] args){


        int[] a = {4,3,2,1,35,6};
        int result =-1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i]==a[j]){
                  result =  a[i];
                }
            }
        }

        System.out.println(result);

    }
}

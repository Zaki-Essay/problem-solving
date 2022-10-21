package javaInterview;

public class DuplicatesElements {


    // JAVA code to find
// duplicates in O(n) time



        public static void main(String args[])
        {
            int numRay[] = { 4 , 8, 1, 4};

            for (int i = 0; i < numRay.length; i++) {
                numRay[numRay[i] % numRay.length]
                        = numRay[numRay[i] % numRay.length]
                        + numRay.length;
            }
            System.out.println("The repeating elements are : ");
            for (int i = 0; i < numRay.length; i++) {
                if (numRay[i] >= numRay.length * 2) {
                    System.out.println(i + " ");
                }
            }
        }


}

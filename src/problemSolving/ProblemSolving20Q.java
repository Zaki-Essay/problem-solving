package problemSolving;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ProblemSolving20Q {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //test for Q#1

        //String string = "Zakariae";
        //System.out.println(reverse1(string));


        //test for Q#2

        //System.out.println(reverse2(string));
        //System.out.println(reverse3(string));
        //System.out.println(reverse4(string));

        //test for Q#3
        //swapTow();


        //test for Q#4

        //printHashMap(numberOfWord("no lfj fjk lfj lfj er er tr er oi er oi "));


        //test for Q#5
        //isPrime();

        //System.out.println(fibonacci(8));

        //int[] array = {1,2,3,4,5,6,11,13,34,54,46,56,87,92,41,1,87};
        //secondLargest(array);


        System.out.println(isArmstrong(153));
    }




    /*
    Q #1) Write a Java Program to reverse a string with using String inbuilt function.
     */

    public static String reverse1(String string){

        StringBuilder stringBuilder = new StringBuilder(string);

        stringBuilder.reverse();



        string = String.valueOf(stringBuilder);

        return string;
    }

    /*
    * Q #2) Write a Java Program to reverse a string without using String inbuilt function reverse()
    * */
    public static String reverse2(String string){

        char[] charArray = string.toCharArray();

        for (int i = 0; i < charArray.length/2; i++) {

            char temp = charArray[i];
            charArray[i] = charArray[charArray.length-i-1];
            charArray[charArray.length-i-1] = temp;



        }
        return String.valueOf(charArray);

    }


    public static String reverse3(String string){

        String[] stringList = string.split("");

        for (int i = 0; i < stringList.length/2; i++) {

           String temp = stringList[i];
           stringList[i] = stringList[stringList.length-i-1];
           stringList[stringList.length-i-1] = temp;



        }

        string ="";
        for (String s : stringList) {
            string+=s;

        }
        return string;

        }


        public static String reverse4(String string){
            String reverse = "";
            for (int i = string.length()-1; i >=0 ; i--) {
                reverse+=string.charAt(i);
            }

        return reverse;
        }

    /*
    *Q #3) Write a Java Program to swap two numbers using the third variable.
    *
    * */
    public static void swapThree(){
        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.println("number 1 est : "+number1+" number 2 est : "+number2);

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("number 1 est : "+number1+" number 2 est : "+number2);


    }



    /*
    *
    * Q #4) Write a Java Program to swap two numbers without using the third variable.
    * */

    public static void swapTow(){
        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.println("number 1 est : "+number1+" number 2 est : "+number2);

        number1 = number2+number1;
        number2 = number1-number2;
        number1 = number1-number2;

        System.out.println("number 1 est : "+number1+" number 2 est : "+number2);


    }


    /*
    * Q #5) Write a Java Program to count the number of words in a string using HashMap.
    *
    * */


    public static HashMap<String,Integer> numberOfWord(String string){

        String[] stringList = string.split(" ");

        HashMap<String,Integer> hashMap = new HashMap<>();
        for (String s : stringList) {
            if (hashMap.containsKey(s)) {
                int key = hashMap.get(s);

                hashMap.put(s, key+1);
            } else {
                hashMap.put(s, 1);
            }
        }
        return hashMap;
    }



    /*
    *
    *
    * Q #6) Write a Java Program to iterate HashMap using While and advance for loop.
    *
    * */



    public static void printHashMap(HashMap<String,Integer> hashMap){
        //method 1:
        hashMap.forEach((key,value)->{
            System.out.println("key : "+key+" | value : "+value);
        });

        //method 2:

        Iterator iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()){

            Map.Entry item = (Map.Entry) iterator.next();
            System.out.println("key : "+item.getKey()+" value : "+item.getValue());
        }


        //method 3 :

        Iterator iterator1 = hashMap.entrySet().iterator();

        while (iterator1.hasNext()){


            System.out.println(iterator1.next());
        }



    }



    /*
    * Q #7) Write a Java Program to find whether a number is prime or not.
    *
    *
    * */

    public static void isPrime(){
        // TODO Auto-generated method stub
        int temp, num;
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();

        if (num==2){
            isPrime = false;
        }
        for (int i = 2; i<= num/2; i++) {
            temp = num%i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + " number is prime");
        else
            System.out.println(num + " number is not a prime");
    }



    /*
    *
    * Q #8) Write a Java Program to find whether a string or number is palindrome or not.
    *
    * */

    public static void isPalindromic () {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        int length;
        System.out.println("Enter the number or String");
        original = in.nextLine();
        length = original.length();
        for (int i =length -1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("reverse is:" +reverse);

        if(original.equals(reverse))
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not a palindrome");

    }


    /*

    *Q #9) Write a Java Program for the Fibonacci series.
     *
     */

    public static int fibonacci(int lastTerm) {
        int number1=0;
        int number2=1;

        for (int i = 2; i <=lastTerm ; i++) {
            int result = number1+number2;
            number1 = number2;
            number2 = result;
        }

        return number2;
    }


    /*
    *
    * Q #10) Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
    * */


        public static void iterateArraylist() {
            ArrayList list = new ArrayList();
            list.add("20");
            list.add("30");
            list.add("40");
            System.out.println(list.size());
            System.out.println("While Loop:");
            Iterator itr = list.iterator();
            while(itr.hasNext()) {
                System.out.println(itr.next());
            }
            System.out.println("Advanced For Loop:");
            for(Object obj : list) {
                System.out.println(obj);
            }
            System.out.println("For Loop:");
            for(int i=0; i<list.size(); i++) {
                System.out.println(list.get(i));
            }
        }


        /*
        *
        * Q #16) Write a Java Program to find the second-highest number in an array.
        *
        * */


        public static void secondLargest(int[] array){

            int max = array[0];
            int secondLargest =array[0];




            for (int i = 1; i < array.length; i++) {

                if (array[i]>max){
                    secondLargest = max;
                    max = array[i];

                }
                else if(array[i]>secondLargest){
                    secondLargest = array[i];
                }

            }


            System.out.println("the largest is :"+max+" and the second largest element is :"+secondLargest);

        }


        /*
        *
        * Q #17) Write a Java Program to check Armstrong number.
        *153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
        *
        * */

        public static boolean isArmstrong(int input){


            int number = input;

            int result=0;
            while (number>0){

                int temp =number%10;
                number/=10;
                result+=temp*temp*temp;

            }



            if (result==input)return true;
            return false;

        }





}

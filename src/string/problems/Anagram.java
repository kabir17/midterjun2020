package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String str1 = "Army";
        String str2 = "mAry";
        System.out.println("Anagram result is : "+anagramCheck(str1,str2));
    }
    public static boolean anagramCheck(String str1,String str2){

        char[] charArrayFromStr1 = str1.toCharArray();
        char[] charArrayFromStr2 = str2.toCharArray();

        Arrays.sort(charArrayFromStr1);
        Arrays.sort(charArrayFromStr2);

        return Arrays.equals(charArrayFromStr1,charArrayFromStr2);
    }
}

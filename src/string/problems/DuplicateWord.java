package string.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences
         * in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

    }
    public static void findDuplicateWord(String givenString){
        //1.split first for space then store into a array words
        String[] words = givenString.split(" ");

        //3.Create a hashmap
        Map<String,Integer> wordCount = new HashMap<String, Integer>();

        //to check each word in given array
        for (String word : words){

            //if word is present= Counting duplicate words
            if(wordCount.containsKey(word)){
                //word=key, if value in hashmap then add 1.it means if any duplicate value then add
                wordCount.put(word.toLowerCase(),wordCount.get(word)+1);
            }
            else {
                wordCount.put(word,1);  //if no value in hashmap then just put 1
            }
        }
        //extracting/retrieve all the keys of map, Set=import interface,keySet=set value.
        Set<String> wordsInString = wordCount.keySet();

        //Count the words by use for..each
        for (String word : wordsInString){
            System.out.println(word+" "+wordCount.get(word));
        }
    }
}

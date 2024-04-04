// Q3:Write a Java Program to count the number of words in a string using HashMap.

import java.util.HashMap;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        HashMap<String, Integer> wordCountMap = countWords(str);
        
        System.out.println("Word Counts:");
        wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));
        
        System.out.println("Total number of words: " + getTotalWords(str));
        
        scanner.close();
    }
    
    public static HashMap<String, Integer> countWords(String str) {
        str = str.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = str.split("\\s+");
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        return wordCountMap;
    }
    
    public static int getTotalWords(String str) {
        return str.split("\\s+").length;
    }
}

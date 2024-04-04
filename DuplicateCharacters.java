// Q4:Write a Java Program to find the duplicate characters in a string.

import java.util.Scanner;

public class DuplicateCharacters {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        scanner.close();
        
        findDuplicateCharacters(str);
    }
    
    public static void findDuplicateCharacters(String str) {
        str = str.toLowerCase();
        
        int[] charCount = new int[256]; 

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }
        
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i] + " occurrences");
            }
        }
    }
}

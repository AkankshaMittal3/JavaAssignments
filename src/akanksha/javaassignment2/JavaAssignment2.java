package akanksha.javaassignment2;
/**
 * Write a java function that checks if the input string contains all the letters of the alphabet a-z
 * (case-insensitive). Write time and space complexity of your solution as comments in the source file.
 *
 * @author Akanksha Mittal
 */

import java.util.Scanner;

public class JavaAssignment2 {
    /**
     * This method checks whether the input string contains all letters or not
     *
     * @param input this is the string entered by user
     */

    public static void checkPanagram(String input) {
        //if length of sting is less than 26
        //then it can not contain all 26 letters
        if (input.length() < 26) {
            System.out.println("Input doesnot contain all letters");
            return;
        }

        // Create a hash table to mark the
        // characters present in the string
        // By default all the elements of
        // mark would be false.
        Boolean alphabet[] = new Boolean[26];

        // For indexing in mark[]
        int index = 0;


        // Traverse all characters
        for (int i = 0; i < input.length(); i++) {

            // If uppercase character, subtract 'A'
            // to find index.
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                index = input.charAt(i) - 'A';
            }

            // If lowercase character, subtract 'a'
            // to find index.
            else if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
            }
            alphabet[index] = true;
        }

        for (int i = 0; i <= 25; i++) {
            // if any character is unmarked
            if (alphabet[i] == false) {
                System.out.println("Input doesnot contain all letters");
                return;
            }
        }
        System.out.println("Input contains all letters");
        return;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ");
        String input = scan.nextLine();
        checkPanagram(input);
    }
}

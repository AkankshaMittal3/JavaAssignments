package akanksha.javaassignment1;
/**
 * Create an java program to search through the home directory and look for files that match a
 * regular expression. The program should be able to take inputs repeatedly and should print out
 * full absolute path of the matching files found.
 *
 * @author Akanksha Mittal
 */


import java.util.Scanner;
import java.io.File;
import java.util.regex.Pattern;

public class JavaAssignment1 {

    /**
     * This method search files recursively in directory and its sub-directories
     *
     * @param dir     this is the directory we're searching in.
     * @param pattern this is regex pattern to be matched with file names.
     */
    public static void searchFiles(String dir, String pattern) {

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Regex or -1 to quit");
        String pattern = scan.next();
        String HALT = "-1";
        String homeDir = "/home/user";

        //Runs until user enters -1
        while (!pattern.equals(HALT)) {
            searchFiles(homeDir, pattern);
            System.out.println("\nEnter Regex or -1 to quit");
            pattern = scan.next();
        }
    }

}

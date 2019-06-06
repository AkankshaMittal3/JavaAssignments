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
        File directory = new File(dir);
        final Pattern regexPattern;
        try {
            regexPattern = Pattern.compile(pattern);
        } catch (Exception e) {
            System.out.println("Invalid Java Regex");
            return;
        }

        //list all files in the directory
        File[] files = directory.listFiles();
        if (files == null)
            return;

        for (File file : files) {
            if (file.isFile()) {

                if (regexPattern.matcher(file.getName()).find())
                    System.out.println(file.getName() + " " + file.getAbsolutePath());
            }

            //Search in the subdirectory
            else if (file.isDirectory())
                searchFiles(pattern, file.getAbsolutePath());
        }

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

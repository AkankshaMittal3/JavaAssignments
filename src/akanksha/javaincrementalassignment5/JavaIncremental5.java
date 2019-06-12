package akanksha.javaincrementalassignment5;
/**
 * Using the documentation for java.util.regex.Pattern as a resource, write and test a regular
 * expression that checks a sentence to see that it begins with a capital letter and ends with a period.
 *
 * @author Akanksha Mittal
 */


import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaIncremental5 {
    public static void check(String str)
    {
        Boolean check = Pattern.matches("^[A-Z].*[.]$", str);
        if(check)
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
    public static void main(String[] a)
    {
        Scanner  scan = new Scanner(System.in);
        String str = scan.nextLine();
        check(str);
    }
}

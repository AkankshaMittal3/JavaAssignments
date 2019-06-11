package akanksha.javaassignment3;
/**
 * Write a java function that will ping any host ( given as input ) and computes the median of the
 * time taken to ping.
 *
 * @author Akanksha Mittal
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaAssignment3 {
    /**
     * This method returns the median of the time taken to ping.
     *
     * @param url     this is the url entered by the user
     */
    private static float pingHost(String url) throws IOException {
        int index = 0;
        String line;
        float time[] = new float[5];

        ProcessBuilder process = new ProcessBuilder("ping", "-c", "5", url);
        Process pingProcess = process.start();

        BufferedReader output = new BufferedReader(new InputStreamReader(pingProcess.getInputStream()));
        Pattern pattern = Pattern.compile("time=([0-9]+[.]?[0-9]*)");

        while ((line = output.readLine()) != null) {

            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                String pingTime = matcher.group(1);
                float t = Float.parseFloat(pingTime);
                time[index++] = t;
            }
        }
        int length = time.length;
        Arrays.sort(time);
        int mid = length / 2;
        if (length % 2 == 0) {
            return (time[mid] + time[mid - 1]) / 2;


        } else {
            return time[mid];
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String host = sc.next();
        Float median = pingHost(host);
        System.out.println("median = " + median);
    }
}

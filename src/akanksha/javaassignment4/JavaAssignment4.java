package akanksha.javaassignment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class JavaAssignment4 {
    public static void kyc(String signUp, String curr)
    {
        Date signUpDate = new Date();
        Date currDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try{
             signUpDate= sdf.parse(signUp);
            currDate = sdf.parse(curr);
        } catch (ParseException e) {
            System.out.println("invalid date");
        }

        Calendar signUpCal = Calendar.getInstance();
        signUpCal.setTime(signUpDate);
        int signUpYear = signUpCal.get(Calendar.YEAR);

        Calendar currCal = Calendar.getInstance();
        currCal.setTime(currDate);

        signUpCal.set(Calendar.YEAR, currCal.get(Calendar.YEAR));//setting year to current year

        signUpCal.add(Calendar.DATE, -30);
        Date first = signUpCal.getTime();

        signUpCal.add(Calendar.DATE, +60);
        Date last = signUpCal.getTime();

        Calendar anniversaryCal = Calendar.getInstance();
        anniversaryCal.setTime(first);

        anniversaryCal.set(Calendar.YEAR, signUpYear+1);

        //computing range
        if (currDate.compareTo(last) < 0 && currDate.compareTo(first) > 0) {
            last = currDate;

        } else if (currDate.compareTo(first) <= 0) {
            first = null;
            last = null;
        } else if (anniversaryCal.getTime().compareTo(first) > 0) {
            first = null;
            last = null;
        }

        if(first == null && last == null)
        {
            System.out.println("No range");
        }
        else
            System.out.println(sdf.format(first) + " " + sdf.format(last));


    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of forms you want");
        int forms = scan.nextInt();
        System.out.println("Enter signup and curr date in this format: dd-mm-yy dd-mm-yy");
        while(forms-- != 0)
        {
            String signUp = scan.next();
            String curr = scan.next();
            kyc(signUp, curr);
        }
}
}

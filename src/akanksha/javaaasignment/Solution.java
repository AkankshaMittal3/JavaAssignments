package akanksha.javaaasignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Solution {

    static void solution(int year, String firstMonth, String secondMonth, String day) throws ParseException {


        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMM");

        //DATE 1
        String dateOne = year + "-" + firstMonth;
        Calendar c1 = Calendar.getInstance();
        Date date1 = formatter.parse(dateOne);
        c1.setTime(date1);

        //set calender to monday of current week
        c1.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        //Get first monday of the month
        c1.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);


        //DATE 2
        String dateTwo = year + "-" + secondMonth;
        Calendar c2 = Calendar.getInstance();
        Date date2 = formatter.parse(dateTwo);
        c2.setTime(date2);

        //set calender to sunday of current week
        c2.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        //Get last sunday of the month
        c2.set(Calendar.DAY_OF_WEEK_IN_MONTH, -1);

        //Difference in weeks
        int weeks = c2.get(Calendar.WEEK_OF_YEAR) - c1.get(Calendar.WEEK_OF_YEAR);
        System.out.println("Number of weeks :" + weeks);

    }

    public static void main(String[] args) throws ParseException {
        solution(2019, "April", "May", "Wednesday");
    }
}

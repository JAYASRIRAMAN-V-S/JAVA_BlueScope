package DateAndTime;

import java.util.Calendar;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Current Time: " + calendar.getTime());

//        Getting the year
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("Date: " + calendar.get(Calendar.DATE));
        System.out.println("Day Of : " + calendar.get(Calendar.DAY_OF_MONTH));
    }
}

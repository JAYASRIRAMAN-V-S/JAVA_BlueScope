package DateAndTime;

// Packages
import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneTutorial {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Time in NewYork: " + calendar.getTime());
    }
}

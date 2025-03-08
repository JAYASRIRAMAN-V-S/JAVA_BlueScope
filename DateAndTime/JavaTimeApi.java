package DateAndTime;

import java.time.*;

public class JavaTimeApi {
    public static void main(String[] args) {
        LocalDate date  = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime =LocalDateTime.now();

//        Based on the Zone...
        ZonedDateTime dateTime1 = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        System.out.println("-----------------");
        System.out.println(dateTime1);
    }
}

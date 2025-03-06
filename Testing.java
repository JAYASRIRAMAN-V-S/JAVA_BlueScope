import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;


public class Testing {
    public static String getDayName(int Day){
        return switch(Day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Day";
        };
    }

    @Test
    void testValidDays(){
        assertEquals("Monday", Testing.getDayName(1));
        assertEquals("Tuesday", Testing.getDayName(2));
        assertEquals("Wednesday", Testing.getDayName(3));
        assertEquals("Thursday", Testing.getDayName(4));
        assertEquals("Friday", Testing.getDayName(5));
        assertEquals("Saturday", Testing.getDayName(6));
        assertEquals("Sunday", Testing.getDayName(7));
    }

    @Test
    void testInvalidDays(){
        assertEquals("Invalid Day", Testing.getDayName(0));
    }

    public static void main(String[] args) {
        int Day = 4;

        System.out.println(getDayName(Day));
    }
}

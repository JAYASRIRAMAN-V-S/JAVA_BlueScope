import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCase01 {
//    Test cases
    @Test
    void testValidNumber(){
        assertEquals(40, addNumbers(20, 20));
    }

    @Test
    void testInvalidNumbers(){
        assertEquals(20, addNumbers(10, 10));
    }


//  Addition Methode
    public static int addNumbers(int a, int b){
        return a + b;
    }
//  Main Methode
    public static void main(String[] args) {
        int a = 10; int b = 20;
        System.out.println(addNumbers(a, b));
    }

}

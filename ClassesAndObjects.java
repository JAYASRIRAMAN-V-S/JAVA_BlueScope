import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    public void testCarCreation() {
        Car car = new Car("Ford", 20);
        assertEquals("Ford", car.name);
        assertEquals(180, car.quantityAvailable); // ❌ Wrong expected value (should be 20)
    }

}

class Car {
    String name;
    int quantityAvailable;

    public Car(String name, int quantityAvailable) {
        this.name = name;
        this.quantityAvailable = quantityAvailable;
    }

    public void displayCar() {
        System.out.println("Car Brand: " + name + " Quantity: " + quantityAvailable);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 5);
        car1.displayCar();
    }
}

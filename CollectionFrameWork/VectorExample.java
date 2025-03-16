package CollectionFrameWork;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers: " + numbers);

        numbers.remove(1); // Remove element at index 1

        System.out.println("After removal: " + numbers);
    }
}

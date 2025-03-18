public class SwitchCase {
    public static void main(String[] args) {
        int Day = 4;

        switch (Day) {
            case 1 -> System.out.println("Sunday");

            case 2 -> System.out.println("Tuesday");

            case 3 -> System.out.println("Wednesday");

            default -> System.out.println("Invalid Day");
        }
    }
}

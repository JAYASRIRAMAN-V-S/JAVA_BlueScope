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

    public static void main(String[] args) {
        int Day = 4;

        System.out.println(getDayName(Day));
    }
}

package Basics;

class StringClassPrinting{
    public static void main(String[] args) {
        String str = "Hello";

        String upperCase = "UPPER CASE WORDS";
        // Returning the length of the String
        System.out.println("The length of the string is " + (str.length()));

        System.out.println(str.charAt(0));

        System.out.println(str.toUpperCase());

        System.out.println(upperCase.toLowerCase());

        System.out.println(str.substring(0, 3));

        System.out.println(str.equals("Hello"));

        System.out.println(str.equalsIgnoreCase("hello"));

        // The print function does not add a new line character at the end of the string
        System.out.print("Hello");

        //  The println function adds a new line character at the end of the string
        System.out.println("Hello");

        System.out.printf("This %s costs %d rupees", "book", 100);
    }
}
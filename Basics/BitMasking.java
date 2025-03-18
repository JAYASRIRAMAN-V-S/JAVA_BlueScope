package Basics;

public class BitMasking {
    public static void main(String[] args) {
        int num = 172;
        int mask = 7;

        int result = num & mask;

        System.out.println("Original number: " + num);
        System.out.println("Mask: " + mask);
        System.out.println("Bit Representation" + Integer.toBinaryString(num));
        
        System.out.println("Bit Representation" + Integer.toBinaryString(mask));

        System.out.println("Result: " + result);
        System.out.println("Result to Binary" + Integer.toBinaryString(result));
    }
}

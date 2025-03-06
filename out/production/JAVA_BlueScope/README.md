# Java Practice 🚀
This repository contains Java programs for practicing core Java concepts, from basic to advanced levels.

---

## 📌 Contents
 **Starter Program** – A simple starter program that prints "Hello, World!" 
    
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

```

---

 **Operators** – Operators are the one that are used to perform mathematical operations."

 ```java
public class OperatorsDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        
        // Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));

        // Assignment Operators
        int c = 10;
        System.out.println("\nAssignment Operators:");
        c += 5;  // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3;  // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2;  // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4;  // c = c / 4
        System.out.println("c /= 4: " + c);
        c %= 3;  // c = c % 3
        System.out.println("c %= 3: " + c);

        // Unary Operators
        int d = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("++d: " + (++d)); // Pre-increment
        System.out.println("d++: " + (d++)); // Post-increment
        System.out.println("--d: " + (--d)); // Pre-decrement
        System.out.println("d--: " + (d--)); // Post-decrement
        System.out.println("Final value of d: " + d);
    }
}

```

 ---

 **Bit Masking and Bit Merging** – Bit Masking is used to extract specific bits and the bit merging is used to combine different bits.
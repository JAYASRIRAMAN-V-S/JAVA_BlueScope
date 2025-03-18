// Interface
interface Animal0001 {
    void makeSound(); // Abstract method (no implementation)
}

// Implementing the Interface
class Dog0001 implements Animal0001 {
    @Override
    public void makeSound() {
        System.out.println("Dog barks!");
    }
}

// Main Class
public class Interface {
    public static void main(String[] args) {
        Animal0001 ani = new Dog0001();
        ani.makeSound();
    }
}

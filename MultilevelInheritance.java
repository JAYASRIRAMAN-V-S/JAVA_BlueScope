class Animal{
    String name = "Cheetah";

    void display(){
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal{
    void dogDisplay(){
        System.out.println("From the dog class...!");
    }
}

class Lion extends Dog{
    void lionDisplay(){
        System.out.println("From the Lion Class...!");
    }
}

//Main Class
public class MultilevelInheritance {
    public static void main(String[] args) {
            Lion animal = new Lion();
            animal.display();
            animal.dogDisplay();
            animal.lionDisplay();
    }
}

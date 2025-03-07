class Vehicle{
    int speed = 60;

    void showSpeed(){
        System.out.println("Speed: " + speed + " km/h");
    }
}

class CarExtends extends Vehicle{
    String brand = "Toyota";

    void displaySpeed(){
        System.out.println("Brand: " + brand);
        showSpeed();
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        CarExtends car = new CarExtends();
        car.displaySpeed();
    }
}

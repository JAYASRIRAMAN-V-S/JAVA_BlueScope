// super :- it is used to access the methods from another class
// this :- it is used to access another methode from the same class
package Basics;
class Vehicles{
    void showDetails1(){
        System.out.println("Vehicle Details");
    }
}

class Car01 extends Vehicles{
    void showDetails(){
        super.showDetails1();
        System.out.println("Car Details");
    }
}


public class ThisAndSuper {

    public static void main(String[] args) {
        Car01 car = new Car01();
        car.showDetails();
    }
}

package Oops;

abstract class Parent{
    abstract String parentMethod();

    String name(){
        return "This is ram";
    }
}

class Child extends  Parent{
    @Override
    String parentMethod(){
        return "This is the child methode";
    }

}

public class AbstractClasses {
    public static void main(String[] args) {
        Parent par = new Child();
        par.parentMethod();
        par.name();
    }
}

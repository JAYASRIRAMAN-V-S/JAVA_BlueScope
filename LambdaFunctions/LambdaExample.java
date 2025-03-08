package LambdaFunctions;
//
//interface MyInterface{
//    void show();
//}
//
//class Demo implements MyInterface{
//    public void show(){
//        System.out.println("Hello Form traditional Method...!");
//    }
//}
//
public class LambdaExample {
    public static void main(String[] args) {
        MyInterface demo = () -> System.out.println("Hello From Lambda...!");
        demo.show();
    }
}


interface MyInterface{
    void show();
}
class MathOperator{

    int add(int a,int b){
        return a + b;
    }

    int add(int a,int b, int c){
        return  a + b + c;
    }

    double add(double a, double b){
        return a * b;
    }

}
public class CompileTimePolymorphism {

    public static void main(String[] args) {
        MathOperator math = new MathOperator();
        System.out.println(math.add(10,20));
    }
}

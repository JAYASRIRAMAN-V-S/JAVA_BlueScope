package LambdaFunctions;

interface Calculator{
    int add(int a, int b);
}

public class LambdaCalculator {
    public static void main(String[] args) {
        Calculator sum = (a, b) -> a + b;
        System.out.println(sum.add(8, 9));
    }
}

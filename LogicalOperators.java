public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Logical And (&&)");

        if(a > b && a == b){
            System.out.println("a is greater than b and a is equal to b");
        } else {
            System.out.println("a is not greater than b and a is not equal to b");
        }

        System.out.println("Logical Or (||)");

        if(a > b || a == b){
            System.out.println("a is greater than b and a is equal to b");
        } else {
            System.out.println("a is not greater than b and a is not equal to b");
        }

        System.out.println("Logical Not (!)");

        if(a != b){
            System.out.println("a is not equal to b");
        }
    }
}

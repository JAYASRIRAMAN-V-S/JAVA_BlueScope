package Basics;

public class ConditionalStatement {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if (x < y) {
            System.out.println("x is less than y");
        }
        else if(x == y){
            System.out.println("x is equal to y");
        }
        else{
            System.out.println("x is greater than y");
        }
    }
}

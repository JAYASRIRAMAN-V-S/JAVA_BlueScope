package LambdaFunctions;

interface Printer{
    void printMessage(String msg);
}

public class LambdaPrinter {
    public static void main(String[] args) {
        Printer print = (msg) ->{
            System.out.println("Printing Message");
            System.out.println(msg);
        };

        print.printMessage("Hey From the Printer Class Lambda Function");
    }
}

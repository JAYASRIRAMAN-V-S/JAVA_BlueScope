package MultiProgramming;

class MyRunnable implements Runnable{
    public void run(){
        for (int i = 1; i <= 5; i++){
            System.out.println("Runnable Thread...!");
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}

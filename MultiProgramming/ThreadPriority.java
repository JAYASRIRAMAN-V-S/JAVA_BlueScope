package MultiProgramming;

class Threads extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is running with the priority " + Thread.currentThread().getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        Threads t1 = new Threads();
        Threads t2 = new Threads();
        Threads t3 = new Threads();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}

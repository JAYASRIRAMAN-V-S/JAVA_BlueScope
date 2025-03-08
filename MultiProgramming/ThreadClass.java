package MultiProgramming;

class MyThread extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Thread is running");
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

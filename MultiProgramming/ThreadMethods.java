package MultiProgramming;

// start() - This will start the thread
// run() - This is where all oru thread code will exist
// sleep() - This is used to specify the timing for the thread
// join() - This will make one thread to wait for the other thread to finish
// setPriority() - This is used to set the priority for the thread
// getPriority() - This is used to get the priority of the thread that is running before
// isAlive() - Check whether the thread is alive or not

class ThreadExample extends Thread{
    public void run(){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}


public class ThreadMethods {
    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        t1.start();
        System.out.println("Is thread alive? " + t1.isAlive());
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Is thread alive? " + t1.isAlive());
    }
}

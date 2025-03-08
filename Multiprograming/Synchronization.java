package Multiprograming;

class BankAccount {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing...");
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Not enough balance for " + Thread.currentThread().getName());
        }
    }
}

public class Synchronization {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Two threads accessing the same account
        Thread t1 = new Thread(() -> account.withdraw(800), "User1");
        Thread t2 = new Thread(() -> account.withdraw(150), "User2");

        t1.start();
        t2.start();
    }
}

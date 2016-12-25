package gUI;

/**
 * Created by Admin on 25.12.2016.
 */
public class MyRunnable implements Runnable {
    private BankAkk bankAkk = new BankAkk();

    public static void main(String[] args) {
        MyRunnable bankAkkrunnable = new MyRunnable();
        Thread thread1 = new Thread(bankAkkrunnable);
        Thread thread2 = new Thread(bankAkkrunnable);
        thread1.setName("Alpha");
        thread2.setName("Beta");
        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (bankAkk.getBalance() < 0) System.out.println("Всё просрали!");
            maceWithdraw(5);
        }
    }

    public void maceWithdraw(int withdraw) {
        int temp = bankAkk.getBalance();
        System.out.println(Thread.currentThread().getName() + " " + bankAkk.getBalance());
        bankAkk.setBalance(temp + withdraw);
        System.out.println(Thread.currentThread().getName() + " " + bankAkk.getBalance());
        System.out.println();
    }
}
package lr13;

public class task3 {
    private static final Object lock=new Object();
    public static void main(String[] args) throws InterruptedException{
        Thread t1=new Thread (()->{
            synchronized (lock) {
                for (int i = 1; i <= 10; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + i);
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });
        Thread t2=new Thread (()->{
            synchronized (lock) {
                for (int i = 1; i <= 10; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + i);
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}

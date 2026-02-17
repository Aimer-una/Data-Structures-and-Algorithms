package 线程题;

public class 三个线程分别打印0到1 {
    private static final Object LOCK = new Object();
    private static volatile int count = 1;
    private static final int MAX = 100;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Seq(0));
        Thread thread2 = new Thread(new Seq(1));
        Thread thread3 = new Thread(new Seq(2));
        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class Seq implements Runnable {
        private final int index;

        public Seq(int index) {
            this.index = index;
        }

        @Override
        public void run() {
            while (count < MAX) {
                synchronized (LOCK) {
                    try {
                        while (count % 3 != index) {
                            LOCK.wait();
                        }
                        if (count <= MAX) {
                            System.out.println("THREAD-" + index + ":" + count);
                        }
                        count++;
                        LOCK.notifyAll();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}



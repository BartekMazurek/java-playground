package J9_Thread;

import static java.lang.Thread.sleep;

class TestRunnableThread implements Runnable {

    private int sleepTime;
    private String name;

    TestRunnableThread(String name, int sleepTime) {
        this.name = name;
        this.sleepTime = sleepTime;
    }

    public void run() {
        int counter = 5;
        for (int i = 0; i < counter; i++) {
            try {
                System.out.println("Thread " + this.name + " counter: " + i);
                Thread.sleep(this.sleepTime); // static Thread method will sleep CURRENT running thread
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class J2_ThreadRunnable {
    public static void main(String[] args) {
        TestRunnableThread runnable = new TestRunnableThread("Thread 1", 1000);
        TestRunnableThread runnable2 = new TestRunnableThread("Thread 2", 200);

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }
}

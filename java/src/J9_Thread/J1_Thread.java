package J9_Thread;

class TestThread extends Thread {

    private int sleepTime;
    private String name;

    TestThread(String name, int sleepTime) {
        this.name = name;
        this.sleepTime = sleepTime;
    }

    public void run() {
        int counter = 5;
        for (int i = 0; i < counter; i++) {
            try {
                System.out.println("Thread " + this.name + " counter: " + i);
                sleep(this.sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class J1_Thread {
    public static void main(String[] args) {

        TestThread thread1 = new TestThread("Thread 1", 1000);
        TestThread thread2 = new TestThread("Thread 2", 200);
        thread1.start();
        thread2.start();

    }
}

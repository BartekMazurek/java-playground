package J9_Thread;

class CounterApp {
    private int counter = 0;

//    public synchronized void increment() {
//        this.counter++;
//    }

    public void increment() {
        this.counter++; // RANDOM VALUE IF METHOD NOT SYNCHRONIZED, 200K IF SYNCHRONIZED
    }

    public int getCounter() {
        return this.counter;
    }
}

class CounterThread implements Runnable {

    private CounterApp app;

    CounterThread(CounterApp app) {
        this.app = app;
    }

    @Override
    public void run() {
        for (int a = 0; a < 100000; a++) {
            this.app.increment();
        }
    }
}

public class J7_RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        // RACE CONDITION
        // WHERE TWO OR MORE THREADS ARE USING SAME DATA (VARIABLES ETC.)
        CounterApp app = new CounterApp();

        Thread thread1 = new Thread(new CounterThread(app));
        Thread thread2 = new Thread(new CounterThread(app));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(app.getCounter());
    }
}

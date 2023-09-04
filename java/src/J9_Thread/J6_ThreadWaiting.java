package J9_Thread;

class ThreadWaiting extends Thread {
    private String name;
    private Thread mainThread;

    public ThreadWaiting(String name, Thread mainThread) {
        this.name = name;
        this.mainThread = mainThread;
    }

    public void run() {
        System.out.println(this.name + " started");
        for (int a = 0; a < 4; a++) {
            try {
                Thread.sleep(1000);
                System.out.println("Main thread state: " + this.mainThread.getState());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(this.name + " finished");
    }
}

public class J6_ThreadWaiting {
    public static void main(String[] args) throws InterruptedException {

        // WAITING
        // USE join() OR wait() METHOD ON THREAD
        // MAIN THREAD WILL WAIT (WAITING STATE) TILL SPECIFIED THREAD FINISH JOB
        Thread mainThread = Thread.currentThread(); // MAIN THREAD

        ThreadWaiting thread1 = new ThreadWaiting("Thread 1", mainThread);
        ThreadWaiting thread2 = new ThreadWaiting("Thread 2", mainThread);
        ThreadWaiting thread3 = new ThreadWaiting("Thread 3", mainThread);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Waiting for t1 to finish...");
        thread1.join();

        System.out.println("Waiting for t2 to finish...");
        thread2.join();

        System.out.println("Waiting for t3 to finish...");
        thread3.join();

        System.out.println("Threads finished");

    }
}

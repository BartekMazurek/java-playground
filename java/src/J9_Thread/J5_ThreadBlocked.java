package J9_Thread;

class BlockedThread implements Runnable {

    // "SYNCHRONIZED" CLAUSE WILL FORCE JVM TO WAIT TILL ONE THREAD FINISH someLogic() EXECUTION
    public static synchronized void someLogic() {
        System.out.println("Executing some logic ....");
        while(true) {
            // INFINITE LOOP
            // SIMULATE LONG WORK
        }
    }

    @Override
    public void run() {
        this.someLogic(); // BOTH THREADS WILL EXECUTE THIS METHOD
    }
}

public class J5_ThreadBlocked {
    public static void main(String[] args) {

        // THREAD BLOCKED EXAMPLE
        // "SYNCHRONIZED" PREVENT TO EXECUTE LOGIC BY THREAD 2 TILL THREAD 1 WILL END PROCESSING
        Thread thread1 = new Thread(new BlockedThread());
        Thread thread2 = new Thread(new BlockedThread());

        thread1.start();
        thread2.start();

        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
    }
}

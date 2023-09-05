package J9_Thread;

public class J9_ThreadDemon {
    public static void main(String[] args) throws InterruptedException {

        // DEMON THREAD

        // JAVA HAS TWO TYPES OF THREADS: CUSTOMER THREADS (EX. MAIN THREAD) AND DEMON THREADS
        // JAVA VIRTUAL MACHINE WILL FINISH WORK WHEN LAST CUSTOMER THREAD WILL FINISH JOB (ALL WORKING DEMON THREADS WILL BE TERMINATED)
        // DEMON THREAD SHOULD BE MARKED AS DEMON BEFORE START
        // THREAD TYPE IS INHERITED FROM THREAD THAT CREATES IT

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Demon thread start");
                while(true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Demon thread working ...");
                }

            }
        });

        thread.setDaemon(true); // MARK THREAD AS DEMON THREAD BEFORE START
        thread.start();
        System.out.println(thread.isDaemon());

        Thread.sleep(5000); // PAUSE MAIN CUSTOMER THREAD
        System.out.println("Finished main thread (demon thread terminated)");
    }
}

package J9_Thread;

public class J3_ThreadLambda {
    public static void main(String[] args) {
        Thread thread = new Thread(
                () -> {
                    int i = 5;
                    while(i > 0) {
                        System.out.println("Counter: " + i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        i--;
                    }
                }
        );
        thread.start();
    }
}

package J4_Date;

public class J6_ScriptExecutionTimer {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try {
            for (int a = 0; a < 5; a++) {
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        long result = end - start;

        System.out.println("Code execution time in ms: " + result);
    }
}

package J9_Thread;

import java.util.LinkedList;

class House {
    private final LinkedList<String> delivery = new LinkedList<>();

    public void waitForDelivery() throws InterruptedException {
        synchronized (delivery) {
            System.out.println("Waiting for delivery...");

            while (delivery.isEmpty()) {
                delivery.wait(); // WILL SLEEP CURRENT THREAD UNTIL notify() METHOD WILL BE USED
            }

            System.out.println("Pizza received: " + delivery.poll());
        }
    }

    public void pizzaGuy() {
        synchronized (delivery) {
            System.out.println("Pizza delivery");
            delivery.add("New pizza");
            delivery.notify(); // WILL WAKE UP WAITING THREAD FOR NOTIFICATION
        }
    }
}

public class J8_ThreadWaitNotify {
    public static void main(String[] args) throws InterruptedException {

        House house = new House();

        // THREAD 1 - WAITING THREAD
        Thread customer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    house.waitForDelivery();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        customer.start();

        Thread.sleep(3000); // SLEEP MAIN THREAD FOR 3 SECONDS

        // THREAD 2 - WILL WAKE UP THREAD 1 WITH notify() IN PIZZA GUY METHOD
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                house.pizzaGuy();
            }
        });
        producer.start();

        customer.join();
    }
}

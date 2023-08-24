package J5_Collection;

import java.util.PriorityQueue;

public class J10_PriorityQueue {

    // PRIORITY QUEUE
    // ELEMENT PRIORITY MORE IMPORTANT THAN ELEMENT ORDER

    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(50);
        queue.add(10);
        queue.add(999);
        queue.add(200);

        System.out.println(queue);

        while(!queue.isEmpty()) {
            // POOL() METHOD WILL GET ONE ELEMENT FROM QUEUE & REMOVE IT FROM QUEUE
            Integer e = queue.poll();
            System.out.println(e);
            System.out.println("Queue: " + queue);
        }
    }
}

package J5_Collection;

import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

class QueueComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        if (Objects.equals(o1, o2)) {
            return 0;
        } else if (o1 > o2) { // ASCENDING ORDER
            return 1;
        } else {
            return -1;
        }

    }
}

public class J11_PriorityQueueComparator {
    public static void main(String[] args) {

        // QUEUE COMPARATOR WILL SORT AUTOMATICALLY ELEMENTS IN ASCENDING ORDER
        PriorityQueue<Integer> queue = new PriorityQueue<>(new QueueComparator());

        queue.add(100);
        queue.add(20);
        queue.add(1);
        queue.add(999);

        System.out.println(queue);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

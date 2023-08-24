package J5_Collection;

import java.util.PriorityQueue;

class Order implements Comparable<Order> {

    private Integer orderId;

    Order(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderId() {
        return this.orderId;
    }

    @Override
    public int compareTo(Order o) {
        int a = this.orderId;
        int b = o.getOrderId();

        if (a == b) {
            return 0;
        } else if (a > b) { // ASCENDING SORT ORDER
            return 1;
        } else {
            return -1;
        }
    }
}

public class J12_PriorityQueueComparable {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();

        // ORDER WITH COMPARABLE INTERFACE WILL COMPARE EACH OBJECT IN QUEUE & SORT THEM BY ORDER ID
        queue.add(new Order(1100));
        queue.add(new Order(90));
        queue.add(new Order(1));
        queue.add(new Order(50000));

        while(!queue.isEmpty()) {
            Order order = (Order) queue.poll();
            System.out.println(order.getOrderId());
        }
    }
}

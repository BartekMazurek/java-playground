package J6_GenericProgramming;

class Point<T>{
    private T x;
    private T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return this.x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return this.y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public String toString() {
        return "Point X: " + this.x + ", Point Y: " + this.y;
    }
}

public class J1_GenericType {
    public static void main(String[] args) {

        // GENERIC TYPES
        // <T> GENERIC TYPE SYMBOL
        // CODE CAN BE REUSED WITH DIFFERENT TYPES OF DATA
        Point<Integer> point = new Point<>(10, 20);
        point.setX(20);
        point.setY(30);

        System.out.println(point.getX());
        System.out.println(point.getY());
    }
}

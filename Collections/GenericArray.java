import java.util.PriorityQueue;

public class GenericArray {
    public static void main(String[] args) {
        PriorityQueue<String> carsQueue = new PriorityQueue<>();

        carsQueue.add("Skoda");
        carsQueue.add("AUDI");
        carsQueue.add("BMW");
        carsQueue.add("LADA");

        System.out.println(carsQueue.peek());

        System.out.println(carsQueue);

        carsQueue.poll();
        System.out.println(carsQueue);

        carsQueue.poll();
        System.out.println(carsQueue);

        carsQueue.remove("Skoda");
        System.out.println(carsQueue);
    }
}

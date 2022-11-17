import java.util.PriorityQueue;

public class CarQueue {
    public static void main(String[] args) {
        PriorityQueue<String> carsQueue = new PriorityQueue<>();

        carsQueue.add("Skoda");
        carsQueue.add("AUDI");
        carsQueue.add("BMW");
        carsQueue.add("Lada");

        System.out.println(carsQueue.peek());
        System.out.println(carsQueue);

        carsQueue.poll();
        System.out.println(carsQueue);
        
        carsQueue.add("AUDI");
        System.out.println(carsQueue);

        carsQueue.remove("BMW");
        System.out.println(carsQueue);
    }
}

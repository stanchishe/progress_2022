import java.util.PriorityQueue;

public class queueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 10; i > 0; i--){
            queue.add(i);
        }
        //PriorityQueue sorts the data for us!
        //Queue: (Front) 1 2 3 4 5 6 7 8 9 10 (Rear)

        //Peeking - obtaining the head
        //Polling - removing the head

        System.out.println("The size of the queue is: " + queue.size());
        System.out.println("The head of the queue us: " + queue.peek());

        queue.poll(); //removing the head
        System.out.println("The size of the queue after the poll is: " + queue.size());
        System.out.println("The new head of the queue is: " + queue.peek());
    }
}

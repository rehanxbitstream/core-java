import java.util.PriorityQueue;

public class PriorityQueueDemonstration {

    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // 1. add(E e): Adds an element to the priority queue
        queue.add(30);
        queue.add(10);
        queue.add(50);
        queue.add(20);
        System.out.println("After add(): " + queue);


        // 2. offer(E e): Adds an element to the priority queue
        queue.offer(40);
        System.out.println("After offer(): " + queue);


        // 3. peek(): Returns the highest-priority element without removing it
        System.out.println("Element returned by peek(): " + queue.peek());
        System.out.println("After peek(): " + queue);


        // 4. element(): Returns the highest-priority element without removing it
        System.out.println("Element returned by element(): " + queue.element());
        System.out.println("After element(): " + queue);


        // 5. poll(): Removes and returns the highest-priority element
        System.out.println("Element removed by poll(): " + queue.poll());
        System.out.println("After poll(): " + queue);


        // 6. remove(): Removes and returns the highest-priority element
        System.out.println("Element removed by remove(): " + queue.remove());
        System.out.println("After remove(): " + queue);

    }
}

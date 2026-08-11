import java.util.ArrayDeque;


public class ArrayDequeDemonstration {

    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // ==============================
        // Insertion Methods
        // ==============================

        // 1. addFirst(): Adds an element at the front
        deque.addFirst(20);
        deque.addFirst(10);
        System.out.println("After addFirst(): " + deque);

        // 2. addLast(): Adds an element at the rear
        deque.addLast(30);
        deque.addLast(40);
        System.out.println("After addLast(): " + deque);

        // 3. offerFirst(): Adds an element at the front
        deque.offerFirst(5);
        System.out.println("After offerFirst(): " + deque);

        // 4. offerLast(): Adds an element at the rear
        deque.offerLast(50);
        System.out.println("After offerLast(): " + deque);

        // 5. push(): Adds an element at the front
        deque.push(1);
        System.out.println("After push(): " + deque);


        // ==============================
        // Retrieval Methods
        // ==============================

        // 6. getFirst(): Returns the first element
        System.out.println("\nFirst element: " + deque.getFirst());

        // 7. getLast(): Returns the last element
        System.out.println("Last element: " + deque.getLast());

        // 8. peekFirst(): Returns the first element
        System.out.println("peekFirst(): " + deque.peekFirst());

        // 9. peekLast(): Returns the last element
        System.out.println("peekLast(): " + deque.peekLast());


        // ==============================
        // Removal Methods
        // ==============================

        // 10. removeFirst(): Removes first element
        System.out.println("\nremoveFirst(): " + deque.removeFirst());
        System.out.println("After removeFirst(): " + deque);

        // 11. removeLast(): Removes last element
        System.out.println("removeLast(): " + deque.removeLast());
        System.out.println("After removeLast(): " + deque);

        // 12. pollFirst(): Removes first element
        System.out.println("pollFirst(): " + deque.pollFirst());
        System.out.println("After pollFirst(): " + deque);

        // 13. pollLast(): Removes last element
        System.out.println("pollLast(): " + deque.pollLast());
        System.out.println("After pollLast(): " + deque);

        // 14. pop(): Removes first element
        System.out.println("pop(): " + deque.pop());
        System.out.println("After pop(): " + deque);


        // ==============================
        // Occurrence Methods
        // ==============================

        deque.addLast(20);
        deque.addLast(30);
        deque.addLast(20);

        System.out.println("\nAfter adding duplicates: " + deque);

        // 15. removeFirstOccurrence()
        deque.removeFirstOccurrence(20);
        System.out.println("After removeFirstOccurrence(): " + deque);

        // 16. removeLastOccurrence()
        deque.removeLastOccurrence(20);
        System.out.println("After removeLastOccurrence(): " + deque);


        // ==============================
        // Reverse Traversal
        // ==============================

        // 17. descendingIterator()
        System.out.print("\nDescending Iterator: ");

        Iterator<Integer> itr = deque.descendingIterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}

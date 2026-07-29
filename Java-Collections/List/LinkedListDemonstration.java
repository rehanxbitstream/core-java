import java.util.LinkedList;
public class LinkedListDemonstration{
public static void main(String[] args){
LinkedList<String> list = new LinkedList<>();

        // 1.addFirst():Inserts an element at the beginning of the list.
        // 2.addLast():Appends an element to the end of the list.
        list.addFirst("B");
        list.addLast("C");
        list.addFirst("A");
        System.out.println("After addFirst() & addLast(): " + list);

        // 3.getFirst() :Returns the first element of the list.
        // 4.getLast():Returns the last element of the list.
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element : " + list.getLast());

        // 5.offer():Adds an element to the end of the list as a queue.
        // 6.offerFirst():Inserts an element at the front of the list.
        // 7.offerLast():Inserts an element at the end of the list.
        list.offer("D");
        list.offerFirst("Start");
        list.offerLast("End");
        System.out.println("\nAfter offer methods: " + list);

        // 8.peek():Returns the first element without removing it.
        //9.peekFirst():Returns the first element without removing it.
        //10.peekLast():Returns the last element without removing it.
        System.out.println("\npeek()      : " + list.peek());
        System.out.println("peekFirst() : " + list.peekFirst());
        System.out.println("peekLast()  : " + list.peekLast());

        //11.poll():Retrieves and removes the first element.
        //12.pollFirst():Retrieves and removes the first element.
        //13.pollLast():Retrieves and removes the last element.
        System.out.println("\npoll()      : " + list.poll());
        System.out.println("pollFirst() : " + list.pollFirst());
        System.out.println("pollLast()  : " + list.pollLast());
        System.out.println("After poll methods: " + list);

        //14.push():Pushes an element onto the front of the list (stack operation).
        list.push("Stack1");
        list.push("Stack2");
        System.out.println("\nAfter push(): " + list);

        //15.pop():Removes and returns the first element (stack operation).
        System.out.println("pop(): " + list.pop());
        System.out.println("After pop(): " + list);

        // Add duplicate elements
        list.add("A");
        list.add("B");
        list.add("A");
        System.out.println("\nAfter adding duplicates: " + list);

        //16.removeFirstOccurrence():Removes the first occurrence of the specified element.
        list.removeFirstOccurrence("A");
        System.out.println("After removeFirstOccurrence(\"A\"): " + list);

        //17.removeLastOccurrence():Removes the last occurrence of the specified element.
        list.removeLastOccurrence("A");
        System.out.println("After removeLastOccurrence(\"A\"): " + list);

        //18.removeFirst():Removes and returns the first element.
        //19.removeLast():Removes and returns the last element.
        System.out.println("\nremoveFirst(): " + list.removeFirst());
        System.out.println("removeLast() : " + list.removeLast());
        System.out.println("After remove methods: " + list);

}
}

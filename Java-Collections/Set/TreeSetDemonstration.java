
import java.util.TreeSet;

public class TreeSetDemonstration {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);

        System.out.println("Original TreeSet: " + set);

        // ========== SortedSet Methods ==========

        // first()
        System.out.println("\nfirst(): " + set.first());

        // last()
        System.out.println("last(): " + set.last());

        // headSet(E)
        System.out.println("headSet(40): " + set.headSet(40));

        // tailSet(E)
        System.out.println("tailSet(40): " + set.tailSet(40));

        // subSet(E, E)
        System.out.println("subSet(20, 60): " + set.subSet(20, 60));

        // comparator()
        System.out.println("comparator(): " + set.comparator());

        // ========== NavigableSet Methods ==========

        // lower()
        System.out.println("\nlower(40): " + set.lower(40));

        // floor()
        System.out.println("floor(45): " + set.floor(45));

        // ceiling()
        System.out.println("ceiling(45): " + set.ceiling(45));

        // higher()
        System.out.println("higher(40): " + set.higher(40));

        // headSet(E, boolean)
        System.out.println("headSet(40, true): " + set.headSet(40, true));

        // tailSet(E, boolean)
        System.out.println("tailSet(40, false): " + set.tailSet(40, false));

        // subSet(E, boolean, E, boolean)
        System.out.println("subSet(20, true, 60, false): "
                + set.subSet(20, true, 60, false));

        // descendingSet()
        System.out.println("descendingSet(): " + set.descendingSet());

        // pollFirst()
        System.out.println("\npollFirst(): " + set.pollFirst());

        // pollLast()
        System.out.println("pollLast(): " + set.pollLast());

        System.out.println("TreeSet after poll operations: " + set);
    }
}

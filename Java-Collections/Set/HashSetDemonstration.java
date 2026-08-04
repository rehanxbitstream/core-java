import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemonstration {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        //1.add():Adds an element if it is not already present.
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // Duplicate
        System.out.println("After add(): " + set);

        //2.contains():Checks whether the element exists in the set.
        System.out.println("\nContains Java: " + set.contains("Java"));
        System.out.println("Contains HTML: " + set.contains("HTML"));

        //3.size():Returns the number of elements in the set.
        System.out.println("\nSize: " + set.size());

        //4.remove():Removes the specified element.
        set.remove("Python");
        System.out.println("\nAfter remove(): " + set);

        //5.isEmpty():Returns true if the set is empty.
        System.out.println("\nIs Empty: " + set.isEmpty());

        //6.clear():Removes all elements from the set.
        set.clear();
        System.out.println("\nAfter clear(): " + set);

        // isEmpty() after clear
        System.out.println("Is Empty: " + set.isEmpty());
    }
}

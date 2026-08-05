import java.util.LinkedHashSet;

public class LinkedHashSetDemonstration{

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        // 1.add():Adds an element if it is not already present.
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // Duplicate
        set.add("HTML");

        System.out.println("After add(): " + set);

        //2.contains():Checks whether an element exists in the set.
        System.out.println("\nContains Java: " + set.contains("Java"));
        System.out.println("Contains CSS : " + set.contains("CSS"));

        //3.size():Returns the number of elements.
        System.out.println("\nSize: " + set.size());

        //4.remove():Removes the specified element.
        set.remove("Python");
        System.out.println("\nAfter remove(): " + set)

        //5.isEmpty():Checks whether the set is empty.
        System.out.println("\nIs Empty: " + set.isEmpty());

        //6.clear():Removes all elements from the set.
        set.clear();
        System.out.println("\nAfter clear(): " + set);

    }
}

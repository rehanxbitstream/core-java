import java.util.ArrayList;
public class ArrayListDemonstration{

pubic static void main(String[] args){
ArrayList<String> list = new ArrayList<>();

        // 1.add():Adds an element at the end
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("SQL");
        System.out.println("After add(): " + list);


        // 2. add(index, element):Adds an element at a specific index
        list.add(2, "JavaScript");
        System.out.println("After add(index, element): " + list);

        // 3. get(int index):Returns the element at the given index
        System.out.println("Element at index 1: " + list.get(1));

        // 4. set(int index, E element):Replaces the element at the specified index
        list.set(3, "HTML");
        System.out.println("After set(): " + list);

        // 5. contains(Object o):Checks whether an element exists
        System.out.println("Contains Java? " + list.contains("Java"));

        // 6. indexOf(Object o):Returns the first index
        System.out.println("Index of SQL: " + list.indexOf("SQL"));

        // 7. size():Returns the number of elements
        System.out.println("Size: " + list.size());

        // 8. isEmpty():Checks whether the list is empty
        System.out.println("Is Empty? " + list.isEmpty());

        // 9. remove(Object o):Removes the first occurrence of an object
        list.remove("HTML");
        System.out.println("After remove(Object): " + list);

        // 10. remove(int index):Removes the element at the specified index
        list.remove(1);
        System.out.println("After remove(index): " + list);

        // 11. addAll(Collection c):Adds all elements of another collection
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Spring");
        list2.add("Hibernate");

        list.addAll(list2);
        System.out.println("After addAll(): " + list);

        // 12. subList():Returns elements from index 1 (inclusive) to 4 (exclusive).
        List<String> sub = list.subList(1, 4);
        System.out.println("SubList: " + sub);

        // 13. ensureCapacity():Increases the internal capacity of the list.
        list.ensureCapacity(20);

        // 14. trimToSize():Reduces internal capacity to the current size.
        list.trimToSize();

        // 15. clear():Removes all elements
        list.clear();

        System.out.println("After clear(): " + list);

        // 24. isEmpty():Checks whether the list is empty
        System.out.println("Is Empty after clear? " + list.isEmpty());
    }
} 
}
}

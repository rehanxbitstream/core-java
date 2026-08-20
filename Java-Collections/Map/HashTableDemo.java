import java.util.Hashtable;

public class HashtableDemo {

    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();

        // 1. put(K key, V value): Adds a key-value pair
        table.put(101, "Java");
        table.put(102, "Python");
        table.put(103, "C++");
        table.put(104, "SQL");

        System.out.println("1. After put(): " + table);


        // 2. get(Object key): Returns the value associated with the key
        System.out.println("\n2. get(102): " + table.get(102));


        // 3. getOrDefault(): Returns value or default value if key is absent
        System.out.println("\n3. getOrDefault(105, \"Unknown\"): "
                + table.getOrDefault(105, "Unknown"));


        // 4. containsKey(): Checks whether a key exists
        System.out.println("\n4. containsKey(101): "
                + table.containsKey(101));


        // 5. containsValue(): Checks whether a value exists
        System.out.println("\n5. containsValue(\"Java\"): "
                + table.containsValue("Java"));


        // 6. size(): Returns the number of key-value pairs
        System.out.println("\n6. size(): " + table.size());


        // 7. isEmpty(): Checks whether the table is empty
        System.out.println("\n7. isEmpty(): " + table.isEmpty());


        // 8. putIfAbsent(): Adds pair only if key is absent
        table.putIfAbsent(105, "HTML");
        table.putIfAbsent(101, "JavaScript");

        System.out.println("\n8. After putIfAbsent(): " + table);


        // 9. remove(key): Removes the pair using the key
        table.remove(105);

        System.out.println("\n9. After remove(): " + table);


        // 10. remove(key, value): Removes only if key and value match
        table.remove(104, "SQL");

        System.out.println("\n10. After remove(key, value): " + table);


        // 11. replace(key, value): Replaces the value of an existing key
        table.replace(103, "C");

        System.out.println("\n11. After replace(): " + table);


        // 12. replace(key, oldValue, newValue):
        // Replaces value only if old value matches
        table.replace(102, "Python", "JavaScript");

        System.out.println("\n12. After replace(oldValue, newValue): "
                + table);


        // 13. putAll(): Adds all entries from another map
        Hashtable<Integer, String> table2 = new Hashtable<>();

        table2.put(105, "HTML");
        table2.put(106, "CSS");

        table.putAll(table2);

        System.out.println("\n13. After putAll(): " + table);


        // 14. keySet(): Returns all keys
        System.out.println("\n14. keySet(): " + table.keySet());


        // 15. values(): Returns all values
        System.out.println("\n15. values(): " + table.values());


        // 16. entrySet(): Returns all key-value pairs
        System.out.println("\n16. entrySet(): " + table.entrySet());


        // 17. forEach(): Traverses every key-value pair
        System.out.println("\n17. forEach():");

        table.forEach((key, value) ->
                System.out.println(key + " : " + value)
        );


        // 18. compute(): Computes a new value for a key
        table.compute(101, (key, value) -> value + " Programming");

        System.out.println("\n18. After compute(): " + table);


        // 19. computeIfAbsent(): Computes value if key is absent
        table.computeIfAbsent(107, key -> "JavaScript");

        System.out.println("\n19. After computeIfAbsent(): " + table);


        // 20. computeIfPresent(): Computes value if key is present
        table.computeIfPresent(106, (key, value) -> value + " Basics");

        System.out.println("\n20. After computeIfPresent(): " + table);


        // 21. merge(): Combines existing value with new value
        table.merge(107, " Advanced",
                (oldValue, newValue) -> oldValue + newValue);

        System.out.println("\n21. After merge(): " + table);


        // 22. clear(): Removes all key-value pairs
        table.clear();

        System.out.println("\n22. After clear(): " + table);

        System.out.println("Is Empty: " + table.isEmpty());
    }
}

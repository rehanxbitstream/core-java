import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding elements
        map.put(10, "Java");
        map.put(20, "Python");
        map.put(30, "C++");
        map.put(40, "SQL");
        map.put(50, "HTML");

        System.out.println("Original TreeMap: " + map);


        // ===================== SortedMap Methods =====================

        // 1. firstKey(): Returns the smallest key
        System.out.println("\n1. firstKey(): " + map.firstKey());


        // 2. lastKey(): Returns the largest key
        System.out.println("2. lastKey(): " + map.lastKey());


        // 3. headMap(K): Returns entries whose keys are less than the given key
        System.out.println("3. headMap(30): " + map.headMap(30));


        // 4. tailMap(K): Returns entries whose keys are greater than or equal to the given key
        System.out.println("4. tailMap(30): " + map.tailMap(30));


        // 5. subMap(K, K): Returns entries between fromKey (inclusive) and toKey (exclusive)
        System.out.println("5. subMap(20, 50): " + map.subMap(20, 50));


        // 6. comparator(): Returns the comparator used for ordering keys
        System.out.println("6. comparator(): " + map.comparator());


        // ===================== NavigableMap Key Methods =====================

        // 7. lowerKey(K): Returns the greatest key strictly less than the given key
        System.out.println("\n7. lowerKey(30): " + map.lowerKey(30));


        // 8. floorKey(K): Returns the greatest key less than or equal to the given key
        System.out.println("8. floorKey(35): " + map.floorKey(35));


        // 9. ceilingKey(K): Returns the smallest key greater than or equal to the given key
        System.out.println("9. ceilingKey(35): " + map.ceilingKey(35));


        // 10. higherKey(K): Returns the smallest key strictly greater than the given key
        System.out.println("10. higherKey(30): " + map.higherKey(30));


        // ===================== NavigableMap Entry Methods =====================

        // 11. lowerEntry(K): Returns the key-value pair with the greatest key less than the given key
        System.out.println("\n11. lowerEntry(30): " + map.lowerEntry(30));


        // 12. floorEntry(K): Returns the key-value pair with the greatest key less than or equal to the given key
        System.out.println("12. floorEntry(35): " + map.floorEntry(35));


        // 13. ceilingEntry(K): Returns the key-value pair with the smallest key greater than or equal to the given key
        System.out.println("13. ceilingEntry(35): " + map.ceilingEntry(35));


        // 14. higherEntry(K): Returns the key-value pair with the smallest key greater than the given key
        System.out.println("14. higherEntry(30): " + map.higherEntry(30));


        // ===================== First / Last Entry =====================

        // 15. firstEntry(): Returns the key-value pair with the smallest key
        System.out.println("\n15. firstEntry(): " + map.firstEntry());


        // 16. lastEntry(): Returns the key-value pair with the largest key
        System.out.println("16. lastEntry(): " + map.lastEntry());


        // ===================== Poll Methods =====================

        // 17. pollFirstEntry(): Removes and returns the entry with the smallest key
        System.out.println("\n17. pollFirstEntry(): " + map.pollFirstEntry());


        // 18. pollLastEntry(): Removes and returns the entry with the largest key
        System.out.println("18. pollLastEntry(): " + map.pollLastEntry());

        System.out.println("After poll methods: " + map);


        // ===================== Descending Methods =====================

        // 19. descendingMap(): Returns a reverse-order view of the map
        System.out.println("\n19. descendingMap(): " + map.descendingMap());


        // 20. navigableKeySet(): Returns a NavigableSet containing all keys
        System.out.println("20. navigableKeySet(): " + map.navigableKeySet());


        // 21. descendingKeySet(): Returns all keys in descending order
        System.out.println("21. descendingKeySet(): " + map.descendingKeySet());


        // ===================== Range Methods =====================

        // 22. headMap(K, boolean): Returns entries before the key with optional inclusion
        System.out.println("\n22. headMap(40, true): "
                + map.headMap(40, true));


        // 23. tailMap(K, boolean): Returns entries after the key with optional inclusion
        System.out.println("23. tailMap(20, false): "
                + map.tailMap(20, false));


        // 24. subMap(K, boolean, K, boolean):
        // Returns entries within a range with control over boundary inclusion
        System.out.println("24. subMap(20, true, 40, false): "
                + map.subMap(20, true, 40, false));


        // ===================== Map Methods =====================

        // 25. keySet(): Returns a Set containing all keys
        System.out.println("\n25. keySet(): " + map.keySet());


        // 26. values(): Returns a Collection containing all values
        System.out.println("26. values(): " + map.values());


        // 27. entrySet(): Returns a Set containing all key-value pairs
        System.out.println("27. entrySet(): " + map.entrySet());


        // ===================== TreeMap Method =====================

        // 28. clone(): Creates a shallow copy of the TreeMap
        TreeMap<Integer, String> copy =
                (TreeMap<Integer, String>) map.clone();

        System.out.println("\n28. clone(): " + copy);
    }
}

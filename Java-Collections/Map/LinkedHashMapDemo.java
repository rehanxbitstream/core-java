import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // 1. put(K key, V value): Adds a key-value pair

        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");
        map.put(104, "SQL");

        System.out.println("1. After put(): " + map);
        
        // 2. get(Object key):Returns the value associated with the key
               System.out.println("\n2. get(102): " + map.get(102));
        
        // 3. getOrDefault(Object key, V defaultValue): Returns value or default value if key is absent

        System.out.println("\n3. getOrDefault(103, \"Unknown\"): "
                + map.getOrDefault(103, "Unknown"));

        System.out.println("getOrDefault(105, \"Unknown\"): "
                + map.getOrDefault(105, "Unknown"));
       
        // 4. containsKey(Object key): Checks whether a key exists
       
        System.out.println("\n4. containsKey(101): "
                + map.containsKey(101));

        // 5. containsValue(Object value):Checks whether a value exists
        System.out.println("\n5. containsValue(\"Java\"): "
                + map.containsValue("Java"));

        // 6. size(): Returns the number of entries
        System.out.println("\n6. size(): " + map.size());

        // 7. isEmpty(): Checks whether the map is empty
      
        System.out.println("\n7. isEmpty(): " + map.isEmpty());
      
        // 8. putIfAbsent(K key, V value): Adds only if the key is absent
        map.putIfAbsent(105, "HTML");
        map.putIfAbsent(101, "JavaScript");

        System.out.println("\n8. After putIfAbsent(): " + map);
    
        // 9. remove(Object key): Removes entry using key
        
        map.remove(105);

        System.out.println("\n9. After remove(105): " + map);

        // 10. remove(Object key, Object value): Removes only if key and value both match
       
        map.remove(104, "SQL");

        System.out.println("\n10. After remove(104, \"SQL\"): " + map);
      
        // 11. replace(K key, V value): Replaces value of an existing key
      
        map.replace(103, "C");

        System.out.println("\n11. After replace(): " + map);
      
        // 12. replace(K key, oldValue, newValue):Replaces only if old value matches
   
        map.replace(102, "Python", "JavaScript");

        System.out.println("\n12. After replace(oldValue, newValue): " + map);
      
        // 13. replaceAll(BiFunction):Replaces every value
      
        map.replaceAll((key, value) -> value.toUpperCase());

        System.out.println("\n13. After replaceAll(): " + map);

        // 14. putAll(Map): Adds all entries from another map
     
        HashMap<Integer, String> map2 = new HashMap<>();

        map2.put(105, "HTML");
        map2.put(106, "CSS");

        map.putAll(map2);

        System.out.println("\n14. After putAll(): " + map);

        // 15. keySet():Returns all keys as a Set
      
        System.out.println("\n15. keySet(): " + map.keySet());

        // 16. values():Returns all values
               System.out.println("\n16. values(): " + map.values());
 
        // 17. entrySet(): Returns all key-value pairs
        
        System.out.println("\n17. entrySet(): " + map.entrySet());
   
        // 18. forEach(BiConsumer): Traverses every key-value pair
        System.out.println("\n18. forEach():");

        map.forEach((key, value) ->
                System.out.println(key + " : " + value)
        );

        // 19. compute(): Computes a new value for a key
        
        map.compute(101, (key, value) -> value + " Programming");

        System.out.println("\n19. After compute(): " + map);
        
        // 20. computeIfAbsent(): Computes value only if key is absent
       
        map.computeIfAbsent(107, key -> "JavaScript");

        System.out.println("\n20. After computeIfAbsent(): " + map);
    
        // 21. computeIfPresent(): Computes value only if key is present
       
        map.computeIfPresent(106, (key, value) -> value + " Basics");

        System.out.println("\n21. After computeIfPresent(): " + map);
      
        // 22. merge(): Combines old value with new value
        map.merge(107, " Advanced",
                (oldValue, newValue) -> oldValue + newValue);

        System.out.println("\n22. After merge(): " + map);
       
        // 23. equals(): Compares two maps
        LinkedHashMap<Integer, String> map3 =
                new LinkedHashMap<>(map);

        System.out.println("\n23. equals(): " + map.equals(map3));


      
        // 24. hashCode(): Returns hash code of the map
        
        System.out.println("\n24. hashCode(): " + map.hashCode());


   
        // 25. removeEldestEntry():Special method of LinkedHashMap
     

        LinkedHashMap<Integer, String> limitedMap =
                new LinkedHashMap<Integer, String>() {

                    @Override
                    protected boolean removeEldestEntry(
                            Map.Entry<Integer, String> eldest) {

                        return size() > 3;
                    }
                };

        limitedMap.put(1, "A");
        limitedMap.put(2, "B");
        limitedMap.put(3, "C");
        limitedMap.put(4, "D");

        System.out.println("\n25. After removeEldestEntry(): "
                + limitedMap);


        // 26. clear():Removes all entries
        map.clear();

        System.out.println("\n26. After clear(): " + map);

        System.out.println("Is Empty: " + map.isEmpty());
    }
}

public class HashMapDemo{

  public static void main(String[] args){
    
        HashMap<Integer, String> map = new HashMap<>();

       
        // 1. put(K key, V value):Adds a key-value pair to the map
       
        map.put(101, "Java");
        map.put(102, "Python");
        map.put(103, "C++");
        map.put(104, "SQL");

        System.out.println("1. After put(): " + map);
    
        // 2. get(Object key):Returns the value associated with the key

        System.out.println("\n2. get(102): " + map.get(102));

        // 3. getOrDefault(Object key, V defaultValue):Returns value if key exists, otherwise returns default value
  
        System.out.println("\n3. getOrDefault(103, \"Unknown\"): "
                + map.getOrDefault(103, "Unknown"));

        System.out.println("getOrDefault(105, \"Unknown\"): "
                + map.getOrDefault(105, "Unknown"));
   
        // 4. containsKey(Object key): Checks whether the specified key exists
      
        System.out.println("\n4. containsKey(101): "
                + map.containsKey(101));

        System.out.println("containsKey(105): "
                + map.containsKey(105));
      
        // 5. containsValue(Object value): Checks whether the specified value exists
        
        System.out.println("\n5. containsValue(\"Java\"): "
                + map.containsValue("Java"));

        System.out.println("containsValue(\"HTML\"): "
                + map.containsValue("HTML"));
     
        // 6. size(): Returns the number of key-value pairs
       
        System.out.println("\n6. size(): " + map.size());
   
        // 7. isEmpty(): Checks whether the map is empty
      
        System.out.println("\n7. isEmpty(): " + map.isEmpty());
    
        // 8. putIfAbsent(K key, V value): Adds value only if the key does not already exist
       
        map.putIfAbsent(105, "HTML");
        map.putIfAbsent(101, "JavaScript");

        System.out.println("\n8. After putIfAbsent(): " + map);

        // 9. remove(Object key): Removes the key-value pair using the key
      
        map.remove(105);

        System.out.println("\n9. After remove(105): " + map);

        // 10. remove(Object key, Object value): Removes pair only if both key and value match
        
        map.remove(104, "SQL");

        System.out.println("\n10. After remove(104, \"SQL\"): " + map);

        // 11. replace(K key, V value):Replaces the value associated with an existing key
      
        map.replace(103, "C");

        System.out.println("\n11. After replace(103, \"C\"): " + map);
        
        // 12. replace(K key, oldValue, newValue): Replaces value only if old value matches
      
        map.replace(102, "Python", "JavaScript");

        System.out.println("\n12. After replace(): " + map);
        
        // 13. replaceAll(BiFunction): Replaces every value using a function
      
        map.replaceAll((key, value) -> value.toUpperCase());

        System.out.println("\n13. After replaceAll(): " + map);

       // 14. putAll(Map): Adds all entries from another map
      
        HashMap<Integer, String> map2 = new HashMap<>();

        map2.put(105, "HTML");
        map2.put(106, "CSS");
        map.putAll(map2);
        System.out.println("\n14. After putAll(): " + map);
     
        // 15. keySet(): Returns a Set containing all keys

        System.out.println("\n15. keySet(): " + map.keySet());

        // 16. values():Returns a Collection containing all values
       
        System.out.println("\n16. values(): " + map.values());
    
        // 17. entrySet():Returns a Set containing all key-value pairs
        
        System.out.println("\n17. entrySet(): " + map.entrySet());

        // 18. forEach(BiConsumer):Traverses every key-value pair
        
        System.out.println("\n18. forEach():");

        map.forEach((key, value) ->
                System.out.println(key + " : " + value)
        );
      
        // 19. compute():Computes a new value for the specified key
        
        map.compute(101, (key, value) -> value + " Programming");

        System.out.println("\n19. After compute(): " + map);
     
        // 20. computeIfAbsent(): Computes value only if key is absent
     
        map.computeIfAbsent(107, key -> "JavaScript");

        System.out.println("\n20. After computeIfAbsent(): " + map);
    
        // 21. computeIfPresent(): Computes value only if key is present
        map.computeIfPresent(106, (key, value) -> value + " Basics");

        System.out.println("\n21. After computeIfPresent(): " + map);

        // 22. merge(): Combines existing value with a new value
      
        map.merge(107, " Advanced",
                (oldValue, newValue) -> oldValue + newValue);

        System.out.println("\n22. After merge(): " + map);

        // 23. equals(): Compares two maps
        HashMap<Integer, String> map3 = new HashMap<>(map);

        System.out.println("\n23. equals(): " + map.equals(map3));

        // 24. hashCode():Returns hash code of the map
        System.out.println("\n24. hashCode(): " + map.hashCode());
       
        // 25. clear():Removes all entries
        map.clear();

        System.out.println("\n25. After clear(): " + map);

        System.out.println("isEmpty() after clear(): " + map.isEmpty());
    }


    
  }

  
}

import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) {

        WeakHashMap<String, String> map = new WeakHashMap<>();

        String key1 = new String("Java");
        String key2 = new String("Python");

        // 1. put(): Adds a key-value pair
        map.put(key1, "Programming Language");
        map.put(key2, "Programming Language");

        System.out.println("After put(): " + map);


        // 2. get(): Returns the value associated with the key
        System.out.println("\nget(key1): " + map.get(key1));


        // 3. containsKey(): Checks whether a key exists
        System.out.println("\ncontainsKey(key1): "
                + map.containsKey(key1));


        // Remove the strong reference to key1
        key1 = null;

        // Request garbage collection
        System.gc();

        // Give the Garbage Collector some time
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nAfter key1 becomes unreachable:");
        System.out.println("Map: " + map);
    }
}

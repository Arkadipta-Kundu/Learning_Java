package CollectionFremework;
import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        // Create a HashMap instance
        Map<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the map
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);

        // Print the current state of the map
        System.out.println("HashMap: " + hashMap);

        // Access a value using a specific key
        int aliceAge = hashMap.get("Alice");
        System.out.println("Alice's age: " + aliceAge);

        // Check if the map contains a specific key 
        boolean containsBob = hashMap.containsKey("Bob");
        System.out.println("Contains key 'Bob': " + containsBob);

        // Check if the map contains a specific value
        boolean containsAge30 = hashMap.containsValue(30);
        System.out.println("Contains value 30: " + containsAge30);

        // Remove a key-value pair from the map
        hashMap.remove("Charlie");
        System.out.println("HashMap after removal: " + hashMap);

        // Update the value associated with a key
        hashMap.put("Bob", 32);
        System.out.println("HashMap after updating Bob's age: " + hashMap);

        // Print the size of the map
        System.out.println("Size of HashMap: " + hashMap.size());

        // Iterate over the map using entrySet
        System.out.println("Iterating using entrySet:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Iterate over the map using keySet
        System.out.println("Iterating using keySet:");
        for (String key : hashMap.keySet()) {
            System.out.println(key + " = " + hashMap.get(key));
        }

        // Iterate over the map using values
        System.out.println("Iterating using values:");
        for (Integer value : hashMap.values()) {
            System.out.println("Value: " + value);
        }

        // Merge two maps
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("David", 40);
        anotherMap.put("Eve", 45);
        hashMap.putAll(anotherMap);
        System.out.println("HashMap after merging anotherMap: " + hashMap);

        // Replace a value for a specific key
        hashMap.replace("Alice", 28);
        System.out.println("HashMap after replacing Alice's age: " + hashMap);

        // Replace a value for a specific key only if it is currently mapped to a specified value
        hashMap.replace("Bob", 32, 33);
        System.out.println("HashMap after conditionally replacing Bob's age: " + hashMap);

        // Get a value with a default if the key is not present
        int unknownAge = hashMap.getOrDefault("Unknown", 0);
        System.out.println("Unknown's age (default): " + unknownAge);

        // Clear all key-value pairs from the map
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);
    }
}

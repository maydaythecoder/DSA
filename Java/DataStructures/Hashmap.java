import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, String> hashMap = new HashMap<>();

        // Set key-value pairs
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");

        // Get value by key
        System.out.println(hashMap.get("key1")); // Output: value1

        // Check if a key exists
        System.out.println(hashMap.containsKey("key2")); // Output: true

        // Delete a key-value pair
        hashMap.remove("key3");

        // Get the size of the HashMap
        System.out.println(hashMap.size()); // Output: 2

        // Iterate over the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println(key + " = " + hashMap.get(key));
        }
    }
}

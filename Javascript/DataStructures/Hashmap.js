// Create a new Map
let hashMap = new Map();

// Set key-value pairs
hashMap.set("key1", "value1");
hashMap.set("key2", "value2");
hashMap.set("key3", "value3");

// Get value by key
console.log(hashMap.get("key1")); // Output: value1

// Check if a key exists
console.log(hashMap.has("key2")); // Output: true

// Delete a key-value pair
hashMap.delete("key3");

// Get the size of the Map
console.log(hashMap.size); // Output: 2

// Iterate over the Map
hashMap.forEach((value, key) => {
  console.log(key + " = " + value);
});

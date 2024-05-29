// Initializing an array
let array = [1, 2, 3, 4];
console.log("Initial array:", array);

// Accessing elements
console.log("First element:", array[0]); // Accessing the first element
console.log("Last element:", array[array.length - 1]); // Accessing the last element

// Adding elements
array.push(5); // Adds 5 to the end
console.log("After push:", array);
array.unshift(0); // Adds 0 to the beginning
console.log("After unshift:", array);
array.splice(2, 0, 2.5); // Adds 2.5 at index 2
console.log("After splice (add 2.5 at index 2):", array);

// Removing elements
array.pop(); // Removes the last element
console.log("After pop:", array);
array.shift(); // Removes the first element
console.log("After shift:", array);
array.splice(1, 1); // Removes 1 element at index 1
console.log("After splice (remove at index 1):", array);

// Modifying elements
array[1] = 10; // Changes the second element to 10
console.log("After modifying second element:", array);

// Reversing the array
array.reverse(); // Reverses the array
console.log("After reverse:", array);

// Sorting the array
array.sort(); // Sorts the array alphabetically or numerically
console.log("After sort:", array);
array.sort((a, b) => a - b); // Sorts the array numerically in ascending order
console.log("After numerical sort:", array);

// Finding maximum and minimum
function findMax(arr) {
  return Math.max(...arr);
}
function findMin(arr) {
  return Math.min(...arr);
}
console.log("Maximum value:", findMax(array));
console.log("Minimum value:", findMin(array));

// Finding sum and average
function findSum(arr) {
  return arr.reduce((a, b) => a + b, 0);
}
function findAverage(arr) {
  return findSum(arr) / arr.length;
}
console.log("Sum of elements:", findSum(array));
console.log("Average of elements:", findAverage(array));

// Finding frequency of elements
function frequencyCount(arr) {
  let frequency = {};
  arr.forEach(item => {
    frequency[item] = (frequency[item] || 0) + 1;
  });
  return frequency;
}
console.log("Frequency count:", frequencyCount(array));

// Removing duplicates
function removeDuplicates(arr) {
  return [...new Set(arr)];
}
console.log("After removing duplicates:", removeDuplicates(array));

// Merging arrays
function mergeArrays(arr1, arr2) {
  return arr1.concat(arr2);
}
let array1 = [1, 2, 3];
let array2 = [4, 5, 6];
console.log("Merged array:", mergeArrays(array1, array2));

// Iterating through the array
console.log("Iterating using for loop:");
for (let i = 0; i < array.length; i++) {
  console.log(array[i]);
}
console.log("Iterating using forEach:");
array.forEach(element => console.log(element));

// Using map to create a new array
let newArray = array.map(x => x * 2);
console.log("New array with elements multiplied by 2:", newArray);

// Using filter to create a new array
let filteredArray = array.filter(x => x > 2);
console.log("Filtered array with elements greater than 2:", filteredArray);

// Using reduce to sum the array elements
let sum = array.reduce((acc, curr) => acc + curr, 0);
console.log("Sum of elements using reduce:", sum);

// Finding an element
let found = array.find(x => x === 2.5);
console.log("Found element (2.5):", found);

// Finding the index of an element
let index = array.indexOf(2.5);
console.log("Index of element (2.5):", index);

// Checking if every element passes a test
let allPositive = array.every(x => x > 0);
console.log("Are all elements positive?:", allPositive);

// Checking if some elements pass a test
let someGreaterThanTwo = array.some(x => x > 2);
console.log("Are some elements greater than 2?:", someGreaterThanTwo);

// Checking if the array includes an element
let includesThree = array.includes(3);
console.log("Does the array include 3?:", includesThree);

// Using slice to copy part of the array
let slicedArray = array.slice(1, 3);
console.log("Sliced array (from index 1 to 3):", slicedArray);

// Joining elements into a string
let joinedString = array.join('-');
console.log("Joined string:", joinedString);

// Finding the length of the array
console.log("Length of the array:", array.length);

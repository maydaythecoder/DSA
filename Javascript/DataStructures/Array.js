let array = [1, 2, 3, 4];
//console.log(array[0]); // Accessing elements
array.push(5); // Adding elements
//console.log(array); 
array.pop(); // Removes last element
//console.log(array); 
array.shift(); // Removes first element
//console.log(array); 
array.splice(1, 1); // Removes element at index 1
//console.log(array); 
array.unshift(3); // Adds 3 to the beginning
//console.log(array); 
array.splice(2, 0, 2.5); // Adds 2.5 at index 2
//console.log(array); 
array.reverse();
//console.log(array); // Outputs [4, 3, 2, 1]



// find min and max
function findMax(arr) {
  return Math.max(...arr);
}
function findMin(arr) {
  return Math.min(...arr);
}
console.log(findMax(array)); // Outputs 9
console.log(findMin(array)); // Outputs 1



// find sum
function findSum(arr) {
  return arr.reduce((a, b) => a + b, 0);
}
function findAverage(arr) {
  return findSum(arr) / arr.length;
}
console.log(findSum(array)); // Outputs 23
console.log(findAverage(array)); // Outputs 3.8333



// Merge arrays
function mergeArrays(arr1, arr2) {
  return arr1.concat(arr2);
}
let array1 = [1, 2, 3];
let array2 = [4, 5, 6];
console.log(mergeArrays(array1, array2)); // Outputs [1, 2, 3, 4, 5, 6]



// loop through array
for (let i = 0; i < array.length; i++) {
    console.log(array[i]);
  }
  array.forEach(element => console.log(element));



//find frequency of element
  function frequencyCount(arr) {
    let frequency = {};
    arr.forEach(item => {
      frequency[item] = (frequency[item] || 0) + 1;
    });
    return frequency;
  }
  console.log(frequencyCount(array)); // Outputs { '1': 1, '2': 2, '3': 3, '4': 1 }



// remove duplicates
function removeDuplicates(arr) {
  return [...new Set(arr)];
}
console.log(removeDuplicates(array)); // Outputs [1, 2, 3, 4]
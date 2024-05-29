import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Array {

    public static void main(String[] args) {
        // Initializing an array
        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Initial array: " + array);

        // Accessing elements
        System.out.println("First element: " + array.get(0));  // Accessing the first element
        System.out.println("Last element: " + array.get(array.size() - 1));  // Accessing the last element

        // Adding elements
        array.add(5);  // Adds 5 to the end
        System.out.println("After append: " + array);
        array.add(0, 0);  // Adds 0 to the beginning
        System.out.println("After insert at beginning: " + array);
        array.add(2, 2);  // Adds 2 at index 2
        System.out.println("After insert at index 2: " + array);

        // Removing elements
        array.remove(array.size() - 1);  // Removes the last element
        System.out.println("After pop: " + array);
        array.remove(0);  // Removes the first element
        System.out.println("After removing first element: " + array);
        array.remove(1);  // Removes element at index 1
        System.out.println("After removing element at index 1: " + array);

        // Modifying elements
        array.set(1, 10);  // Changes the second element to 10
        System.out.println("After modifying second element: " + array);

        // Reversing the array
        Collections.reverse(array);  // Reverses the array
        System.out.println("After reverse: " + array);

        // Sorting the array
        Collections.sort(array);  // Sorts the array alphabetically or numerically
        System.out.println("After sort: " + array);
        array.sort(Integer::compareTo);  // Sorts the array numerically in ascending order
        System.out.println("After numerical sort: " + array);

        // Finding maximum and minimum
        System.out.println("Maximum value: " + Collections.max(array));
        System.out.println("Minimum value: " + Collections.min(array));

        // Finding sum and average
        System.out.println("Sum of elements: " + array.stream().mapToInt(Integer::intValue).sum());
        System.out.println("Average of elements: " + array.stream().mapToInt(Integer::intValue).average().orElse(0));

        // Finding frequency of elements
        System.out.println("Frequency count: " + array.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())));

        // Removing duplicates
        List<Integer> arrayWithoutDuplicates = array.stream().distinct().collect(Collectors.toList());
        System.out.println("After removing duplicates: " + arrayWithoutDuplicates);

        // Merging arrays
        List<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> array2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> mergedArray = new ArrayList<>(array1);
        mergedArray.addAll(array2);
        System.out.println("Merged array: " + mergedArray);

        // Iterating through the array
        System.out.println("Iterating using for loop:");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        System.out.println("Iterating using forEach:");
        array.forEach(System.out::println);

        // Using map to create a new array
        List<Integer> newArray = array.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println("New array with elements multiplied by 2: " + newArray);

        // Using filter to create a new array
        List<Integer> filteredArray = array.stream().filter(x -> x > 2).collect(Collectors.toList());
        System.out.println("Filtered array with elements greater than 2: " + filteredArray);

        // Using reduce to sum the array elements
        int sumOfElements = array.stream().reduce(0, Integer::sum);
        System.out.println("Sum of elements using reduce: " + sumOfElements);

        // Finding an element
        boolean found = array.contains(2);
        System.out.println("Found element (2): " + found);

        // Finding the index of an element
        int index = array.indexOf(2);
        System.out.println("Index of element (2): " + index);

        // Checking if every element passes a test
        boolean allPositive = array.stream().allMatch(x -> x > 0);
        System.out.println("Are all elements positive?: " + allPositive);

        // Checking if some elements pass a test
        boolean someGreaterThanTwo = array.stream().anyMatch(x -> x > 2);
        System.out.println("Are some elements greater than 2?: " + someGreaterThanTwo);

        // Checking if the array includes an element
        boolean includesThree = array.contains(3);
        System.out.println("Does the array include 3?: " + includesThree);

        // Using slice to copy part of the array
        List<Integer> slicedArray = array.subList(1, 3);
        System.out.println("Sliced array (from index 1 to 3): " + slicedArray);

        // Joining elements into a string
        String joinedString = array.stream().map(String::valueOf).collect(Collectors.joining("-"));
        System.out.println("Joined string: " + joinedString);

        // Finding the length of the array
        System.out.println("Length of the array: " + array.size());
    }
}

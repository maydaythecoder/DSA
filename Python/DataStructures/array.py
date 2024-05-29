# Initializing an array
array = [1, 2, 3, 4]
print("Initial array:", array)

# Accessing elements
print("First element:", array[0])  # Accessing the first element
print("Last element:", array[-1])  # Accessing the last element

# Adding elements
array.append(5)  # Adds 5 to the end
print("After append:", array)
array.insert(0, 0)  # Adds 0 to the beginning
print("After insert at beginning:", array)
array.insert(2, 2.5)  # Adds 2.5 at index 2
print("After insert at index 2:", array)

# Removing elements
array.pop()  # Removes the last element
print("After pop:", array)
array.pop(0)  # Removes the first element
print("After removing first element:", array)
del array[1]  # Removes element at index 1
print("After removing element at index 1:", array)

# Modifying elements
array[1] = 10  # Changes the second element to 10
print("After modifying second element:", array)

# Reversing the array
array.reverse()  # Reverses the array
print("After reverse:", array)

# Sorting the array
array.sort()  # Sorts the array alphabetically or numerically
print("After sort:", array)
array.sort(reverse=False)  # Sorts the array numerically in ascending order
print("After numerical sort:", array)

# Finding maximum and minimum
def find_max(arr):
    return max(arr)

def find_min(arr):
    return min(arr)

print("Maximum value:", find_max(array))
print("Minimum value:", find_min(array))

# Finding sum and average
def find_sum(arr):
    return sum(arr)

def find_average(arr):
    return find_sum(arr) / len(arr)

print("Sum of elements:", find_sum(array))
print("Average of elements:", find_average(array))

# Finding frequency of elements
def frequency_count(arr):
    frequency = {}
    for item in arr:
        frequency[item] = frequency.get(item, 0) + 1
    return frequency

print("Frequency count:", frequency_count(array))

# Removing duplicates
def remove_duplicates(arr):
    return list(set(arr))

print("After removing duplicates:", remove_duplicates(array))

# Merging arrays
def merge_arrays(arr1, arr2):
    return arr1 + arr2

array1 = [1, 2, 3]
array2 = [4, 5, 6]
print("Merged array:", merge_arrays(array1, array2))

# Iterating through the array
print("Iterating using for loop:")
for i in range(len(array)):
    print(array[i])

print("Iterating using forEach (list comprehension):")
[print(element) for element in array]

# Using map to create a new array
new_array = list(map(lambda x: x * 2, array))
print("New array with elements multiplied by 2:", new_array)

# Using filter to create a new array
filtered_array = list(filter(lambda x: x > 2, array))
print("Filtered array with elements greater than 2:", filtered_array)

# Using reduce to sum the array elements
from functools import reduce
sum_of_elements = reduce(lambda acc, curr: acc + curr, array)
print("Sum of elements using reduce:", sum_of_elements)

# Finding an element
found = next((x for x in array if x == 2.5), None)
print("Found element (2.5):", found)

# Finding the index of an element
index = array.index(2.5) if 2.5 in array else -1
print("Index of element (2.5):", index)

# Checking if every element passes a test
all_positive = all(x > 0 for x in array)
print("Are all elements positive?:", all_positive)

# Checking if some elements pass a test
some_greater_than_two = any(x > 2 for x in array)
print("Are some elements greater than 2?:", some_greater_than_two)

# Checking if the array includes an element
includes_three = 3 in array
print("Does the array include 3?:", includes_three)

# Using slice to copy part of the array
sliced_array = array[1:3]
print("Sliced array (from index 1 to 3):", sliced_array)

# Joining elements into a string
joined_string = '-'.join(map(str, array))
print("Joined string:", joined_string)

# Finding the length of the array
print("Length of the array:", len(array))

from collections import Counter

array = [1, 2, 3, 4]
# print(array[0]) # Accessing elements
array.append(5) # Adding elements
# print(array)
array.pop() # Removes last element
# print(array)
array.pop(0) # Removes first element
# print(array)
del array[1] # Removes element at index 1
# print(array)
array.insert(3, 0) # Adds 3 to the beginning
# print(array)
array.insert(2, 2.5) # Adds 2.5 at index 2
# print(array)
array.reverse()
# print(array) # Outputs [4, 3, 2, 1]



# find min and max
def find_max(arr):
    return max(arr)
def find_min(arr):
    return min(arr)
print(find_max(array)) # Outputs 9
print(find_min(array)) # Outputs 1



# find sum
def find_sum(arr):
    return sum(arr)
def find_average(arr):
    return sum(arr) / len(arr)
print(find_sum(array)) # Outputs 23
print(find_average(array)) # Outputs 3.8333



# Merge arrays
def merge_arrays(arr1, arr2):
    return arr1 + arr2
array1 = [1, 2, 3]
array2 = [4, 5, 6]
print(merge_arrays(array1, array2)) # Outputs [1, 2, 3, 4, 5, 6]



# loop through array
for element in array:
    print(element)



# find frequency of element
def frequency_count(arr):
    return Counter(arr)
array = [1, 2, 2, 3, 3, 3, 4]
print(frequency_count(array)) # Outputs Counter({3: 3, 2: 2, 1: 1, 4: 1})



# remove duplicates
def remove_duplicates(arr):
    return list(set(arr))
array = [1, 2, 2, 3, 3, 3, 4]
print(remove_duplicates(array)) # Outputs [1, 2, 3, 4]

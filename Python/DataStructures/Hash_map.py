# Create a new dictionary
hash_map = {}

# Set key-value pairs
hash_map['key1'] = 'value1'
hash_map['key2'] = 'value2'
hash_map['key3'] = 'value3'

# Get value by key
print(hash_map['key1'])  # Output: value1

# Check if a key exists
print('key2' in hash_map)  # Output: True

# Delete a key-value pair
del hash_map['key3']

# Get the size of the dictionary
print(len(hash_map))  # Output: 2

# Iterate over the dictionary
for key, value in hash_map.items():
    print(f'{key} = {value}')

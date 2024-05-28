class Node:
    def __init__(self, data, next=None):
        self.data = data
        self.next = next

class LinkedList:
    def __init__(self):
        self.head = None
        self.size = 0

    # Insert first Node
    def insert_first(self, data):
        self.head = Node(data, self.head)
        self.size += 1

    # Insert last Node
    def insert_last(self, data):
        node = Node(data)
        if not self.head:
            self.head = node
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = node
        self.size += 1

    # Insert at Index
    def insert_at(self, data, index):
        if index > 0 and index > self.size:
            return
        if index == 0:
            self.head = Node(data, self.head)
            self.size += 1
            return

        node = Node(data)
        current = self.head
        previous = None
        count = 0

        while count < index:
            previous = current
            current = current.next
            count += 1

        node.next = current
        previous.next = node
        self.size += 1

    # Get at Index
    def get_at(self, index):
        current = self.head
        count = 0

        while current:
            if count == index:
                print(current.data)
                return current.data
            count += 1
            current = current.next

        return None

    # Remove at Index
    def remove_at(self, index):
        if index > 0 and index > self.size:
            return
        current = self.head
        previous = None
        count = 0

        if index == 0:
            self.head = current.next
        else:
            while count < index:
                previous = current
                current = current.next
                count += 1
            previous.next = current.next
        self.size -= 1

    # Clear List
    def clear_list(self):
        self.head = None
        self.size = 0

    # Print List data
    def print_list_data(self):
        current = self.head
        while current:
            print(current.data)
            current = current.next

# Example usage:
linked_list_one = LinkedList()

#linked_list_one.insert_first(100)
#linked_list_one.insert_first(200)
#linked_list_one.insert_first(300)
#linked_list_one.insert_last(400)
#linked_list_one.insert_at(500, 2)
#linked_list_one.insert_at(600, 0)
#linked_list_one.insert_at(700,10)#Test edge cases
#linked_list_one.print_list_data()

#linked_list_one.remove_at(2)
#linked_list_one.print_list_data()

#linked_list_one.get_at(2)
#linked_list_one.get_at(3)
#linked_list_one.get_at(10)#test edge cases

#linked_list_one.clear_list()
#linked_list_one.print_list_data()

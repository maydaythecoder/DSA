class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;
    private int size;

    LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Insert first node
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Insert last node
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Insert node at a specific index
    public void insertAt(int data, int index) {
        if (index > size) {
            return;
        }
        if (index == 0) {
            insertFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        Node previous = null;
        int count = 0;

        while (count < index) {
            previous = current;
            current = current.next;
            count++;
        }

        newNode.next = current;
        previous.next = newNode;
        size++;
    }

    // Get data at a specific index
    public Integer getAt(int index) {
        if (index >= size) {
            return null;
        }
        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                System.out.println(current.data);
                return current.data;
            }
            count++;
            current = current.next;
        }
        return null;
    }

    // Remove node at a specific index
    public void removeAt(int index) {
        if (index >= size) {
            return;
        }

        Node current = head;
        Node previous = null;
        int count = 0;

        if (index == 0) {
            head = current.next;
        } else {
            while (count < index) {
                previous = current;
                current = current.next;
                count++;
            }
            previous.next = current.next;
        }
        size--;
    }

    // Clear the list
    public void clearList() {
        head = null;
        size = 0;
    }

    // Print list data
    public void printListData() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(100);
        linkedList.insertFirst(200);
        linkedList.insertFirst(300);
        linkedList.insertLast(400);
        linkedList.insertAt(500, 2);
        linkedList.insertAt(600, 0);
        linkedList.printListData();
        linkedList.getAt(2);
        linkedList.removeAt(2);
        linkedList.printListData();
        linkedList.clearList();
        linkedList.printListData();
    }
}

import java.util.ArrayList;

class Stack {
    private ArrayList<Integer> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    // Push element onto the stack
    public void push(int element) {
        items.add(element);
    }

    // Pop element from the stack
    public int pop() {
        if (items.isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        return items.remove(items.size() - 1);
    }

    // Peek at the top element of the stack
    public int peek() {
        if (items.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return items.get(items.size() - 1);
    }

    // Print the stack
    public void printStack() {
        System.out.println(items);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack:");
        stack.printStack();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Pop element: " + stack.pop());
        System.out.println("Stack after pop:");
        stack.printStack();
    }
}

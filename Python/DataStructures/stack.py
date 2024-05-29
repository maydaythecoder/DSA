class Stack:
    def __init__(self):
        self.stack = []

    def push(self, element):
        self.stack.append(element)

    def pop(self):
        if not self.stack:
            return "Underflow"
        return self.stack.pop()

    def peek(self):
        return self.stack[-1]

class Queue:
    def __init__(self):
        self.queue = []

    def enqueue(self, element):
        self.queue.append(element)

    def dequeue(self):
        if not self.queue:
            return "Underflow"
        return self.queue.pop(0)

    def front(self):
        if not self.queue:
            return "No elements in Queue"
        return self.queue[0]

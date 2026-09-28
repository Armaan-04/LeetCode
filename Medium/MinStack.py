class MinStack(object):

    def __init__(self):
        self.array = []

    def push(self, value):
        self.array.append(value)

    def pop(self):
        self.array.pop()

    def top(self):
        return self.array[-1]

    def getMin(self):
        minimum = self.array[0]

        for i in range(len(self.array)):
            if self.array[i] < minimum:
                minimum = self.array[i]

        return minimum
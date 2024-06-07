class MyStack {
    private int[] stack;
    private int top;

    public MyStack() {
        stack = new int[100]; // Initialize the stack with a maximum size of 100
        top = -1; // Initialize the top index to -1 (empty stack)
    }

    public void push(int x) {
        if (top < stack.length - 1) { // Check if there's space in the stack
            stack[++top] = x; // Increment the top index and add the element
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {
        if (top >= 0) { // Check if the stack is not empty
            return stack[top--]; // Retrieve the top element and decrement the top index
        } else {
            System.out.println("Stack Underflow");
            return -1; // Return a default value if the stack is empty
        }
    }

    public int top() {
        if (top >= 0) { // Check if the stack is not empty
            return stack[top]; // Return the top element
        } else {
            System.out.println("Stack Underflow");
            return -1; // Return a default value if the stack is empty
        }
    }

    public boolean empty() {
        return top == -1; // Return true if the top index is -1 (empty stack)
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

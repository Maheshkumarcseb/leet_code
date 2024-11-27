package leet_code.STACK;
import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    public void pop() {
        if (!stack.isEmpty()) {
            if (stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            stack.pop();
        }
    }
    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        throw new RuntimeException("Stack is empty");
    } 
    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new RuntimeException("Min stack is empty");
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        
        // Test operations
        minStack.push(10);
        minStack.push(5);
        minStack.push(20);
        System.out.println("Top element: " + minStack.top());    // Output: 20
        System.out.println("Minimum element: " + minStack.getMin()); // Output: 5

        minStack.pop();
        System.out.println("Top element after pop: " + minStack.top()); // Output: 5
        System.out.println("Minimum element: " + minStack.getMin()); // Output: 5

        minStack.pop();
        System.out.println("Top element after another pop: " + minStack.top()); // Output: 10
        System.out.println("Minimum element: " + minStack.getMin()); // Output: 10

        minStack.pop();

        // Uncomment to test exception handling:
        // System.out.println("Minimum element when stack is empty: " + minStack.getMin());
        // System.out.println("Top element when stack is empty: " + minStack.top());
    }
}

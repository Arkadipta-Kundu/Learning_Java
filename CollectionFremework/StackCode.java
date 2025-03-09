package CollectionFremework;

import java.util.Stack;

public class StackCode {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack 
        stack.push(12);
        stack.push(16);
        stack.push(20);
        System.out.println("Stack after pushes: " + stack);

        // Pop an element from the stack
        stack.pop();
        System.out.println("Stack after pop: " + stack);

        // Peek at the top element of the stack without removing it
        int topElement = stack.peek();
        System.out.println("Top element after peek: " + topElement);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Search for an element in the stack
        int position = stack.search(12);
        if (position != -1) {
            System.out.println("Element 12 found at position: " + position);
        } else {
            System.out.println("Element 12 not found in the stack");
        }
    }
}

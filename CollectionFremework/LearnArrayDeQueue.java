package CollectionFremework;
import java.util.ArrayDeque;
import java.util.Iterator;

public class LearnArrayDeQueue {
    public static void main(String[] args) {
        // Create an ArrayDeque instance 
        ArrayDeque<Integer> deQueue = new ArrayDeque<>();

        // Add elements to the front and back of the deque
        deQueue.addFirst(1);
        deQueue.addFirst(2);
        deQueue.addLast(3);
        deQueue.addLast(4);

        // Print the current state of the deque
        System.out.println("Deque after adding elements: " + deQueue);

        // Peek at the first and last elements without removing them
        System.out.println("First element: " + deQueue.peekFirst());
        System.out.println("Last element: " + deQueue.peekLast());

        // Remove and print the first and last elements
        System.out.println("Removed first element: " + deQueue.pollFirst());
        System.out.println("Removed last element: " + deQueue.pollLast());

        // Print the current state of the deque after removals
        System.out.println("Deque after removing elements: " + deQueue);

        // Add more elements to demonstrate additional operations
        deQueue.addFirst(5);
        deQueue.addLast(6);
        deQueue.add(7); // Adds to the end by default

        // Print the current state of the deque
        System.out.println("Deque after adding more elements: " + deQueue);

        // Check if the deque contains a specific element
        System.out.println("Deque contains 5: " + deQueue.contains(5));
        System.out.println("Deque contains 10: " + deQueue.contains(10));

        // Iterate over the elements in the deque
        System.out.print("Iterating over deque: ");
        Iterator<Integer> iterator = deQueue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Convert deque to array
        Object[] array = deQueue.toArray();
        System.out.print("Deque as array: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // Remove a specific element
        deQueue.remove(6);
        System.out.println("Deque after removing element 6: " + deQueue);

        // Get the size of the deque
        System.out.println("Size of deque: " + deQueue.size());

        // Check if the deque is empty
        System.out.println("Is deque empty? " + deQueue.isEmpty());

        // Clear all elements from the deque
        deQueue.clear();

        // Print the current state of the deque after clearing
        System.out.println("Deque after clearing: " + deQueue);
    }
}
package CollectionFremework;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListCode {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();
        
        // Add elements to the queue
        queue.offer(10); 
        queue.offer(20);
        queue.offer(30);
        System.out.println("Initial queue: " + queue);

        // Remove an element from the queue
        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after removal: " + queue);

        // Peek at the head of the queue
        int head = queue.peek();
        System.out.println("Head of the queue: " + head);

        // Print the final state of the queue
        System.out.println("Final queue: " + queue);

        // Add another element to the queue
        queue.offer(12);
        System.out.println("Queue after adding 12: " + queue);

        // Check if the queue contains a specific element
        boolean contains20 = queue.contains(20);
        System.out.println("Does the queue contain 20? " + contains20);

        // Get the size of the queue
        int size = queue.size();
        System.out.println("Size of the queue: " + size);

        // Clear all elements from the queue
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
    }
}

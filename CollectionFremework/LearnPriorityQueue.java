package CollectionFremework;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        Queue<Integer> pq = new PriorityQueue<>();
 
        // Add elements to the PriorityQueue
        pq.offer(18);
        pq.offer(12);
        pq.offer(13);
        pq.offer(69);
        pq.offer(5);
        pq.offer(3);

        // Print the PriorityQueue
        // Note: The elements may not be in sorted order when printed
        System.out.println("PriorityQueue: " + pq);

        // Peek at the head of the PriorityQueue
        // This retrieves, but does not remove, the head of the queue
        System.out.println("Head of the queue: " + pq.peek());

        // Remove elements from the PriorityQueue
        // This removes the head of the queue
        System.out.println("Removed element: " + pq.poll());
        System.out.println("PriorityQueue after removal: " + pq);

        // Iterate over the elements in the PriorityQueue
        System.out.println("Iterating over elements:");
        for (Integer element : pq) {
            System.out.println(element);
        }
    }
}

package CollectionFremework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        // Create a List of integers
        List<Integer> list = new ArrayList<>();

        // Add elements to the List
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(18);
        list.add(12);
        list.add(13);
        list.add(69);
        list.add(5);
        list.add(3);

        // Print the List
        System.out.println("List: " + list);

        // Access elements by index
        System.out.println("Element at index 2: " + list.get(2));
 
        // Modify elements by index
        list.set(2, 20);
        System.out.println("List after setting element at index 2: " + list);

        // Remove elements by index
        list.remove(4);
        System.out.println("List after removing element at index 4: " + list);

        // Check if the List contains a specific element
        System.out.println("List contains 13: " + list.contains(13));
        System.out.println("List contains 10: " + list.contains(10));

        // Get the size of the List
        System.out.println("Size of the List: " + list.size());

        // Iterate over the List using an iterator
        Iterator<Integer> iterator = list.iterator();
        System.out.print("List elements using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Sort the List
        Collections.sort(list);
        System.out.println("List after sorting: " + list);

        // Reverse the List
        Collections.reverse(list);
        System.out.println("List after reversing: " + list);

        // Shuffle the List
        Collections.shuffle(list);
        System.out.println("List after shuffling: " + list);

        // Convert List to array
        Integer[] array = list.toArray(new Integer[0]);
        System.out.print("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Clear all elements from the List
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}

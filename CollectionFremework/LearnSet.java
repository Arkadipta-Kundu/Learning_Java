package CollectionFremework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args){
        // Using HashSet to demonstrate basic set operations
        Set<Integer> hset = new HashSet<>();

        // Adding elements to the HashSet
        hset.add(12);
        hset.add(12); // Duplicate element, will not be added
        hset.add(15);
        hset.add(16);
        System.out.println("HashSet: " + hset); // Output: [16, 12, 15]

        // Removing an element from the HashSet
        hset.remove(12);
        System.out.println("HashSet after removal: " + hset); // Output: [16, 15]

        // Checking if an element exists in the HashSet
        boolean contains15 = hset.contains(15);
        System.out.println("HashSet contains 15: " + contains15); // Output: true

        // Checking the size of the HashSet
        int size = hset.size();
        System.out.println("Size of HashSet: " + size); // Output: 2

        // Iterating through the HashSet
        System.out.print("Iterating through HashSet: ");
        for (Integer num : hset) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Clearing the HashSet
        hset.clear();
        System.out.println("HashSet after clearing: " + hset); // Output: []

        // Using TreeSet to demonstrate sorted set operations
        Set<Integer> tset = new TreeSet<>();

        // Adding elements to the TreeSet
        tset.add(16);
        tset.add(19);
        tset.add(20);
        tset.add(21);
        System.out.println("TreeSet: " + tset); // Output: [16, 19, 20, 21]

        // Removing an element from the TreeSet
        tset.remove(19);
        System.out.println("TreeSet after removal: " + tset); // Output: [16, 20, 21]

        // Checking if an element exists in the TreeSet
        boolean contains20 = tset.contains(20);
        System.out.println("TreeSet contains 20: " + contains20); // Output: true

        // Checking the size of the TreeSet
        int tsetSize = tset.size();
        System.out.println("Size of TreeSet: " + tsetSize); // Output: 3

        // Iterating through the TreeSet
        System.out.print("Iterating through TreeSet: ");
        Iterator<Integer> iterator = tset.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Demonstrating the sorted nature of TreeSet
        tset.add(18);
        System.out.println("TreeSet after adding 18: " + tset); // Output: [16, 18, 20, 21]

        // Clearing the TreeSet
        tset.clear();
        System.out.println("TreeSet after clearing: " + tset); // Output: []
    }
}

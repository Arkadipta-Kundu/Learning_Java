package CollectionFremework;

import java.util.HashSet;
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

        // Demonstrating the sorted nature of TreeSet
        tset.add(18);
        System.out.println("TreeSet after adding 18: " + tset); // Output: [16, 18, 20, 21]
    }
}

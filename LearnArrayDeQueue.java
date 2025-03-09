package CollectionFremework;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Iterator;

public class LearnArrayDeQueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // Adding elements to the ArrayDeque
        adq.offer(12);
        adq.offerFirst(16);
        System.out.println(adq);
        adq.offerLast(18);
        System.out.println(adq);
        adq.offer(18);
        adq.offer(6);
        adq.offer(22);
        adq.offer(9);
        System.out.println(adq);
        adq.offerLast(19);
        System.out.println(adq);
        adq.offerFirst(1);
        System.out.println(adq);

        // Display the elements of the ArrayDeque
        show(adq);

        // Calculate and display the maximum element in the ArrayDeque
        System.out.println("Max element in the array is: " + maxElement(adq));

        // Check and display if the ArrayDeque is a palindrome
        System.out.println("Is the array palindrome: " + isPalindrome(adq));

        // Print "Hello World" 5 times
        printHelloWorld(5);
    }

    // Method to display elements of the ArrayDeque
    public static void show(ArrayDeque<Integer> adq) {
        System.out.println("Elements in the ArrayDeque: " + adq);
    }

    // Method to calculate the maximum element in the ArrayDeque
    public static int maxElement(ArrayDeque<Integer> adq) {
        int max = Integer.MIN_VALUE;
        for (int num : adq) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to check if the ArrayDeque is a palindrome
    public static boolean isPalindrome(ArrayDeque<Integer> adq) {
        Integer[] arr = adq.toArray(new Integer[0]);
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (!arr[start].equals(arr[end])) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method to print "Hello World" n times
    public static void printHelloWorld(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World");
        }
    }
}

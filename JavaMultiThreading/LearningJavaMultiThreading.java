package JavaMultiThreading;

public class LearningJavaMultiThreading {
    public static void main(String[] args) {
        // Create a new thread using the Thread class with an anonymous Runnable
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " running");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted");
                }
                System.out.println(Thread.currentThread().getName() + " finished");
            }
        }, "Thread 1");

        // Create another thread using a lambda expression
        Thread thread2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " running");
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(500); // Sleep for 0.5 seconds
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted");
                }
            }
            System.out.println(Thread.currentThread().getName() + " finished");
        }, "Thread 2");

        // Create a thread by extending the Thread class
        Thread thread3 = new CustomThread("Thread 3");

        // Set thread priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Set thread1 to minimum priority
        thread2.setPriority(Thread.MAX_PRIORITY); // Set thread2 to maximum priority
        thread3.setPriority(Thread.NORM_PRIORITY); // Set thread3 to normal priority

        // Set thread2 as a daemon thread
        thread2.setDaemon(true);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for the threads to finish
        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
            thread3.join(); // Wait for thread3 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("All threads finished");
    }
}

// Custom thread class by extending the Thread class
class CustomThread extends Thread {
    public CustomThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " running");
        try {
            Thread.sleep(1500); // Sleep for 1.5 seconds
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}

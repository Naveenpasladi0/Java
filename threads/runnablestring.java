package threads;

public class runnablestring implements Runnable {
    public void run() {
        System.out.println("Fourth string is running");
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object of the class MyThread2
        Runnable r1 = new runnablestring();
        // Creating an object of the class Thread using Thread(Runnable r, String name)
        Thread th1 = new Thread(r1, "Another fourth thread is running");
        // The start() method moves the thread to the active state
        th1.start();
        // getting the thread name by invoking the getName() method
        String str = th1.getName();
        System.out.println(str);
    }
}

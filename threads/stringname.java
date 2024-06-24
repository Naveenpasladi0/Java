package threads;

public class stringname {
    public static void main(String[] args) {
        // Creating an object of the Thread class using the constructor Thread(String name)
        Thread t3= new Thread("Third string is running");
        // The start() method moves the thread to the active state
        t3.start();
        //Getting the thread name by invoking the getName() method
        String str = t3.getName();
        System.out.println(str);
    }
}

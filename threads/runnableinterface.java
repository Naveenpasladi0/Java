package threads;

class Multi2 implements Runnable {
    public void run() {
        System.out.println("Second thread is running");
    }
}

public class runnableinterface {
    public static void main(String[] args) {
        Multi2 m2 = new Multi2();
        Thread t2 = new Thread(m2);
        t2.start();
    }
}

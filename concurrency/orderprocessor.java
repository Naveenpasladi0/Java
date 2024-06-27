package concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Order class representing a food order
class Order {
    private final String orderId;
    private final String itemName;
    private final int quantity;

    public Order(String orderId, String itemName, int quantity) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "OrderId=" + orderId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

// OrderProcessor class that simulates an order
class Orderprocessor implements Runnable {
    private final Order order;

    public Orderprocessor(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        System.out.println("Processing order: " + order);
        try {
            // Simulate time taken to process the order
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Completed processing order: " + order.getOrderId());
    }
}

// Main class to simulate an online food ordering system
public class orderprocessor {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Create and submit multiple orders for processing
        for (int i = 1; i <= 5; i++) {
            Order order = new Order("Order" + i, "Item" + i, i * 2);
            Orderprocessor orderprocessor = new Orderprocessor(order);
            executorService.submit(orderprocessor);
        }
    }
}
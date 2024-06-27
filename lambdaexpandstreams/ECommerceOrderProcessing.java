package lambdaexpandstreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Order class representing an e-commerce order
class Order {
    private final String orderId;
    private final String customerName;
    private final double orderAmount;

    public Order(String orderId, String customerName, double orderAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderAmount = orderAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "OrderId=" + orderId + '\'' +
                ", customerName=" + customerName + '\'' +
                ", orderAmount=" + orderAmount +
                '}';
    }
}

// Main class to demonstrate the use of lambda expressions and streams
public class ECommerceOrderProcessing {
    private static String filteredOrders;

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("1", "Allice", 250.0));
        orders.add(new Order("2", "Bob", 150.0));
        orders.add(new Order("3", "Charlie", 300.0));
        orders.add(new Order("4", "John", 200.0));
        orders.add(new Order("5", "Eve", 180.0));

        // Filter orders with amount greater than 200
        List<Order> filterOrders = orders.stream()
                .filter(order -> order.getOrderAmount() > 200)
                .collect(Collectors.toList());

        // Sort orders by amount
        List<Order> sortedOrders = orders.stream()
                .sorted(Comparator.comparing(Order::getOrderAmount))
                .collect(Collectors.toList());

        // Get list of customer names
        List<String> customerNames = orders.stream()
                .map(Order::getCustomerName)
                .collect(Collectors.toList());

        // Calculate total order amount
        double totalOrderAmount = orders.stream()
                .mapToDouble(Order::getOrderAmount)
                .sum();

        // Display results
        System.out.println("Filtered Orders: " + filteredOrders);
        System.out.println("Sorted Orders: " + sortedOrders);
        System.out.println("Customer Names: " + customerNames);
        System.out.println("Total Order Amount: " + totalOrderAmount);
    }
}
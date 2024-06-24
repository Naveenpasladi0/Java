package collectionframework.reallifeexm;

import java.util.*;

public class ecommerce {
    public static void main(String[] args) {
        // 1-ArrayList of Products in E-Commerce
        List<String> shoppingCart = new ArrayList<>();
        shoppingCart.add("Samsung S24");
        shoppingCart.add("iPhone 15 Pro Max");
        shoppingCart.add("Nothing 2");
        shoppingCart.add("Realme GT 30S");
        shoppingCart.add("iPhone 15");
        shoppingCart.add("iPhone 14 Pro Max");
        shoppingCart.add("iPhone 13 Plus");
        shoppingCart.add("Renewed iPhone 13 Plus");
        shoppingCart.add("Renewed iPhone 13 Plus");

        System.out.println("Searched Results 7 Out of 50");
        for (String mobiles : shoppingCart) {
            System.out.println(mobiles);
        }
        // 2-HashList of Products in E-Commerce
        Set<Integer> uniqueProductIds = new HashSet<>();
        uniqueProductIds.add(1001); // Laptop
        uniqueProductIds.add(1002); // Smartphone
        uniqueProductIds.add(1003); // Headphones
        uniqueProductIds.add(1004); // Smartwatch
        uniqueProductIds.add(1005); // Tablet
        uniqueProductIds.add(1006); // Monitor
        uniqueProductIds.add(1007); // Keyboard
        uniqueProductIds.add(1008); // Mouse
        uniqueProductIds.add(1009); // Printer
        uniqueProductIds.add(1010); // External Hard Driver
        // HashMap to store product ID and product Name
        Map<Integer, String> productMap = new HashMap<>();
        productMap.put(1001, "Laptop");
        productMap.put(1002, "Smartphone");
        productMap.put(1003, "Headphones");
        productMap.put(1004, "Smartwatch");
        productMap.put(1005, "Tablet");
        productMap.put(1006, "Monitor");
        productMap.put(1007, "Keyboard");
        productMap.put(1008, "Mouse");
        productMap.put(1009, "Printer");
        productMap.put(1010, "External Hard Driver");
        // Printing the Product IDs and Product Names
        for (Integer productId : uniqueProductIds) {
            String productName = productMap.get(productId);
            System.out.println("Product ID: " + productId + ", Product Name: " + productName);
        }
    }
}

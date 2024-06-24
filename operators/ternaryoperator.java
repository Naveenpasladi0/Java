package operators;

public class ternaryoperator {
    public static void main(String[] args) {
        int number = 20;

        // Using the ternary operator determine if the number is odd or even
        String result = (number % 2 == 0) ? "Even" : "Odd";

        // Print the result
        System.out.println("The number is: " + result);
    }
}

package exceptionhandeling.zerohandeling;

public class zerohandeling {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int a = 10;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // This block will handle ArithmeticException
            System.out.println("Error: Cannot divide by Zero.");
        } finally {
            // This block will always execute
            System.out.println("Finally block is executed.");
        }
        System.out.println("Program continues...");
    }
}

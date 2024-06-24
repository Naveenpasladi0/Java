package controlflowstatement;

public class exceptionhandelingstatement {
    public static void main(String[] args) {
        // 1 - Exception handling statements
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("This block is always executed");
        }
    }
}
package operators;

public class assignementoperator {
    public static void main(String[] args) {
        int a, b;

        // Assigning the values to the assignment operator
        a = 10;
        b = 20;

        // Performing an operation and assign the result to another variable
        int sum = a + b;

        // Print the values and results
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);
        System.out.println("Sum of a and b is " + sum);

        // Reassign a new value to variable a
        a = 7;

        // Print the update value of a
        System.out.println("Updated value of a is " + a);
    }
}

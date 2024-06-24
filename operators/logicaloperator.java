package operators;

public class logicaloperator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND
        boolean resultAnd = a && b; // It should return false
        System.out.println("Logical AND: " + resultAnd);
        // Logical OR
        boolean resultOr = a || b; // It should return true
        System.out.println("Logical OR: " + resultOr);
        // Logical NOT
        boolean resultNotA = !a;
        System.out.println("Logical Not for a: " + resultNotA);
        // Combining logical operators
        boolean resultCombined = (a && b) || !a; // It should return (true && false) || false => false
        System.out.println("Combined logical operator: " + resultCombined);
    }
}

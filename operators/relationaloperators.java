package operators;

public class relationaloperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // 1 - Equal to (==)
        if (a == b) {
            System.out.println("True a is equal to b");
        }
        else {
            System.out.println("False a is not equal to b");
        }

        // 2 - Not equal to (!=)
        if (a != b) {
            System.out.println("True a is not equal to b");
        }
        else {
            System.out.println("False a is equal to b");
        }

        // Greater than (>)
        if (a > b) {
            System.out.println("True a is greater than b");
        }
        else {
            System.out.println("False a is not greater than b");
        }

        // Less than (<)
        if (a < b) {
            System.out.println("True a is less than b");
        }
        else {
            System.out.println("False a is not less than b");
        }

        // Greater than equal to (>=)
        if (a >= b) {
            System.out.println("True a is greater than equal to b");
        }
        else {
            System.out.println("False a is not greater than equal to b");
        }

        // Less than equal to (<=)
        if (a <= b) {
            System.out.println("True a is less than or equal to b");
        }
        else {
            System.out.println("False a is not less than or equal to b");
        }

    }
}

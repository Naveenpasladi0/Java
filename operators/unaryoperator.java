package operators;

public class unaryoperator {
    public static void main(String[] args) {
        int x = 30;
        // Java unary operator example 01 ++ and --
        System.out.println(x++); // 30
        System.out.println(++x); // 32
        System.out.println(x--); // 32
        System.out.println(--x); // 30

        // Java unary operator example 02 ++ and --
        int a = 20;
        int b = 30;
        System.out.println(a++ + ++a); // 20 + 22 = 42
        System.out.println(b++ + ++b); // 30 + 32 = 62
    }
}

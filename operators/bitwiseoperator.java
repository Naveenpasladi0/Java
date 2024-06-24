package operators;

public class bitwiseoperator {
    public static void main(String[] args) {
        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011

        // Bitwise AND
        int resultAnd = a + b; // Binary: 0001
        System.out.println("Bitwise And " + resultAnd);
        // Bitwise OR
        int resultOr = a | b; // Binary: 0111
        System.out.println("Bitwise Or " + resultOr);
        // Bitwise XOR
        int resultXor = a ^ b; // Binary: 0110
        System.out.println("Bitwise Xor " + resultXor);
        // Bitiwise NOT
        int resultNot = -a;
        System.out.println("Bitwise Not for a: " + resultNot);
        // Left Shift
        int leftshifted = a << 1;
        System.out.println("Left Shift " + leftshifted);
        // Right Shift
        int rightShifted = a >> 1;
        System.out.println("Right Shift " + rightShifted);
    }
}

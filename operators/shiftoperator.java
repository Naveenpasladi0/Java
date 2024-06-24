package operators;

public class shiftoperator {
    public static void main(String[] args) {
        // Left shift operator
        System.out.println(10 << 2); // 10*2^2 = 10*4 = 40
        System.out.println(30 << 3); // 30*2^3 = 30*8 = 240
        System.out.println(5 << 4); // 5*2^4 = 5*16 = 80
        System.out.println(20 << 7); // 20*2^7 = 20*128 = 2560
        System.out.println(50 << 5); // 50*2^5 = 50*32 = 1600

        // Right shift operator
        System.out.println(20 >> 2); // 20/2^2 = 20/4 = 5
        System.out.println(20 >> 3); // 20/2^2^2 = 20/8 = 2
        System.out.println(40 >> 2); // 40/2^2 = 40/4 = 10
        System.out.println(60 >> 5); // 60/2^2^2^2^2 = 60/32 = 1
        System.out.println(80 >> 4); // 80/2^2^2^2 = 80/16 = 5

        // Shift operator - The actual operator
        // For positive number, >> and >>> works same
        System.out.println(20 >> 2); // 20*2^2 = 20/4 = 5
        System.out.println(20 >>> 2); // 20*2^2 = 20/4 = 5
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20 >> 2); // -20/2^2 = -20/4 = -5
        System.out.println(-20 >>> 2); // -20/2^2 = 20/4 = null values
    }
}

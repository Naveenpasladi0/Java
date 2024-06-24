package datatypes;

public class primitivedatatypes {
    public static void main(String[] args) {
        // 1 - Boolean data types
        boolean flag = true;
        System.out.println(flag);

        // 2 - Char data types
        char letter = '\u0051';
        System.out.println(letter); // Here the unicode of 0 is \u0051. Hence, we get 0 as the output.
        // Another example of Char data types
        char letter1 = '9';
        char letter2 = 65; // 65 is the ASCII code for 'A' and this will print A.
        System.out.println(letter);
        System.out.println(letter1);
        System.out.println(letter2);

        // 3 - Byte data type
        byte range;
        range = 24;
        System.out.println(range);

        // 4 - Short data type
        short temperature;
        temperature = -200;
        System.out.println(temperature);

        // 5 - Int data type
        int number = -4250000;
        System.out.println(number);

        // 6 - Long data type
        long number1 = -42322523332L;
        System.out.println(number1);

        // 7 - Double data type
        double number2 = -42.3;
        System.out.println(number2);

        // 8 - Float data type
        float number3 = -42.35f;
        System.out.println(number3);
    }
}
package inputoutput;

import java.util.Scanner;

public class consoleio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + "years old");

        scanner.close();

        System.out.println("This is a line of text.");
        System.out.println("This is text without a newline");
        System.out.println("This is text with a newline");
    }
}

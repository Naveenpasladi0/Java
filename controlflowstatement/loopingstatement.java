package controlflowstatement;

public class loopingstatement {
    public static void main(String[] args) {
        // 1 - for loop statement
        for (int i = 0; i < 5; i++) {
            System.out.println("i is " + i);
        }

        // 2 - enhanced for loop statement
        int[] numbers = {1,2,3,4,5};
        for (int number : numbers) {
            System.out.println("number is " + number);
        }

        // 3 - while loop
        int i = 0;
        while (i < 11) {
            System.out.println("i is " + i);
            i++;
        }

        // do while loop
        int j = 0;
        do {
            System.out.println("j is " + i);
            i++;
        } while (j < 5);
    }
}
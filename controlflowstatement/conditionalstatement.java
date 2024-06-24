package controlflowstatement;

public class conditionalstatement {
    public static void main(String[] args) {
        // 1 - if statement
        int x = 20;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        // 2 - if-else statement
        int y = 15;
        if (y > 20) {
            System.out.println("y is greater than 20");
        }
        else {
            System.out.println("y is not greater than 20");
        }

        // 3 - if-else-if Ladder
        int z = 30;
        if (z == 0) {
            System.out.println("z is zero");
        }
        else if (z > 0) {
            System.out.println("z is positive");
        }
        else {
            System.out.println("z is negative");
        }

        // 4 - switch statement
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
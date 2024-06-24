package exceptionhandeling.zerohandeling;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class customhandeling {
    public static void main(String[] args) {
        try {
            validate(15);
        } catch (CustomException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }

    // Method to validate age
    static void validate(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age is not valid to vote");
        } else {
            System.out.println("Welcome to vote");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be at least 18.");
        } else {
            System.out.println("Age verified.");
        }
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // causes ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}

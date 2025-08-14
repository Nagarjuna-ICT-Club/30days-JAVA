public class MethodsExample {
    
    // Method with parameters
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method with return value
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        greetUser("Jack"); // Call method with argument

        int sum = addNumbers(5, 7); // Call method and store result
        System.out.println("Sum: " + sum);
    }
}

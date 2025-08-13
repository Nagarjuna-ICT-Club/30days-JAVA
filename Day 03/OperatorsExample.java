public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic
        System.out.println("Sum: " + (a + b)); // 15

        // Relational
        System.out.println("Is a greater than b? " + (a > b)); // true

        // Logical
        System.out.println("Both positive? " + (a > 0 && b > 0)); // true

        // Assignment
        a += 3; // a = a + 3
        System.out.println("New value of a: " + a); // 13
    }
}

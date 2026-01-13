import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;
        switch (op) {
            case '+': result = calc.add(a, b); break;
            case '-': result = calc.subtract(a, b); break;
            case '*': result = calc.multiply(a, b); break;
            case '/': result = calc.divide(a, b); break;
            default: System.out.println("Invalid operation!"); return;
        }

        System.out.println("Result: " + result);
    }
}

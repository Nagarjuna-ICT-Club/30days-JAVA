public class ControlFlowExample {
    public static void main(String[] args) {
        int number = 2;

        // If-Else Example
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Non-positive number");
        }

        // Switch Example
        switch (number) {
            case 1:
                System.out.println("Number is One");
                break;
            case 2:
                System.out.println("Number is Two");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}

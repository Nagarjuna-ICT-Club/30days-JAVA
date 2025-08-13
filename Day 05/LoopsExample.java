public class LoopsExample {
    public static void main(String[] args) {
        
        // For Loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("For Loop Count: " + i);
        }

        // While Loop
        int j = 1;
        while (j <= 3) {
            System.out.println("While Loop Count: " + j);
            j++;
        }

        // Do-While Loop
        int k = 1;
        do {
            System.out.println("Do-While Loop Count: " + k);
            k++;
        } while (k <= 3);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Map example
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        System.out.println("Student 101: " + studentMap.get(101));

        // Queue example
        Queue<String> line = new LinkedList<>();
        line.add("First");
        line.add("Second");
        line.add("Third");
        System.out.println("Queue head: " + line.peek());
        System.out.println("Removed from queue: " + line.poll());
        System.out.println("Queue now: " + line);
    }
}

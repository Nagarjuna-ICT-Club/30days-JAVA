import java.io.*;
import java.util.*;

public class ToDoList {
    private List<String> tasks = new ArrayList<>();
    private final String fileName = "tasks.txt";

    public void loadTasks() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String task;
            while ((task = br.readLine()) != null) {
                tasks.add(task);
            }
        } catch (IOException e) {
            System.out.println("No saved tasks found.");
        }
    }

    public void saveTasks() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (String task : tasks) {
                bw.write(task);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks.");
        }
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void showTasks() {
        if (tasks.isEmpty()) System.out.println("No tasks yet!");
        else tasks.forEach(t -> System.out.println("- " + t));
    }
}

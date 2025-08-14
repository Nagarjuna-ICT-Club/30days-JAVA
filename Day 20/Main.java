public class Main {
    public static void main(String[] args) {
        Runnable task1 = new MyTask("Task 1");
        Runnable task2 = new MyTask("Task 2");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}

class MyTask implements Runnable {
    private String name;

    public MyTask(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is running: " + i);
            try {
                Thread.sleep(500); // pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
        }
    }
}

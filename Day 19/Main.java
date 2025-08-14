public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        thread1.start();
        thread2.start();
    }
}

class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
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

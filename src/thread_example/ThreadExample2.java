package thread_example;

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread thread = new Thread("MyThread") {
            public void run() {
                System.out.println("Thread running with name: " + getName());
            }
        };
        thread.start();
    }
}

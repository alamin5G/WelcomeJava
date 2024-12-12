package thread_example;

public class ThreadExample4 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Thread running with a Runnable target and name: " + Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(runnable, "MyRunnableThread");
        thread.start();
    }
}

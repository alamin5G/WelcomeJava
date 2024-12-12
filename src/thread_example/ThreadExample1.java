package thread_example;

public class ThreadExample1 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run(){
                System.out.println("Thread Running");
            }
        };
        thread.start();
    }
}

package thread_example;

class A extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("From class A");
    }
}

class B extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
        }
        System.out.println("From class B");
    }
}

class C extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("From class C");
    }
}

public class Main {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        threadA.start();
        threadB.start();
        threadC.start();
    }
}

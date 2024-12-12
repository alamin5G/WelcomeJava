package exceptionHandling;

public class Main {

    public static void main(String[] args) {


        try {
            int a = 10;
            int b = 0;
            int c = divide(a, b);
            System.out.println("c = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exceptiont: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block is always executed");
        }

        try {

            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println("c = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exceptions: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block is always executed");
        }

    }

    public static int divide(int a, int b) throws ArithmeticException  {

        return a / b;
    }

}




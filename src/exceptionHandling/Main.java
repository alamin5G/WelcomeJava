package exceptionHandling;

public class Main {

    public static void main(String[] args) {



        try {
            int result = divide(10, 0);

            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block is always executed");
        }

    }

    public static int divide(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {

        if (b == 0) {
            throw new ArithmeticException("Divide by zero is not allowed");
        }else {
            return a / b;
        }

    }

}




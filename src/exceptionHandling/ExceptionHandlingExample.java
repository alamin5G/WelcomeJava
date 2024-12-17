package exceptionHandling;

import java.io.*;

// Custom Exception Class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Checked Exception Example
        handleCheckedException();

        // Unchecked Exception Example
        handleUncheckedException();

        // Multiple Exceptions in One Try-Catch
        multipleExceptionsHandling();

        // Throw and Handle Custom Exception
        handleCustomException();

        // Finally Block Example
        finallyBlockExample();

        // Error Example (Demonstration)
        errorExample();
    }

    // 1. Handling Checked Exception
    static void handleCheckedException() {
        try {
            // FileNotFoundException (Checked Exception)
            FileReader file = new FileReader("nonexistent.txt");
            BufferedReader br = new BufferedReader(file);
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception: File not found! " + e);
        } catch (IOException e) {
            System.out.println("IO Exception occurred: " + e);
        }
    }

    // 2. Handling Unchecked Exception
    static void handleUncheckedException() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception: Array index out of bounds! " + e);
        }

        try {
            int result = 10 / 0; // ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: Division by zero! " + e);
        }
    }

    // 3. Multiple Exceptions in a Single Try-Catch
    static void multipleExceptionsHandling() {
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException

            int num = Integer.parseInt("ABC"); // NumberFormatException
            System.out.println(num);
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Multiple Exception Handling: " + e);
        }
    }

    // 4. Custom Exception Example
    static void handleCustomException() {
        try {
            validateAge(15); // Custom logic for age
        } catch (CustomException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }

    static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    // 5. Finally Block Example
    static void finallyBlockExample() {
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } finally {
            System.out.println("Finally block always executes (Cleanup code here).");
        }
    }

    // 6. Error Example (Not Recommended to Handle)
    static void errorExample() {
        try {
            int[] largeArray = new int[Integer.MAX_VALUE]; // OutOfMemoryError
        } catch (OutOfMemoryError e) {
            System.out.println("Error Caught: " + e);
        }
    }
}


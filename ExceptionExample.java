public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int num = 10;
            int denominator = 0;
            int result = num / denominator; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching the exception
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            // Code to execute after try-catch block, whether or not an exception was thrown
            System.out.println("Execution completed.");
        }
    }
}

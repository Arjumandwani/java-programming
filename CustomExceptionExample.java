public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // Test the age validation
            int age = -5; // Invalid age
            if (age < 0) {
                throw new InvalidAgeException("Age cannot be negative");
            }
            System.out.println("Age: " + age);
        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            // Code to execute regardless of an exception
            System.out.println("Execution completed.");
        }
    }  }

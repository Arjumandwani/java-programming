import java.util.Scanner;

public class rightmost {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first non-negative integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second non-negative integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third non-negative integer: ");
        int num3 = scanner.nextInt();

      
        boolean result = haveSameRightmostDigits(num1, num2, num3);

     
        System.out.println("Do two or more integers have the same rightmost digit? " + result);
    }


    public static boolean haveSameRightmostDigits(int a, int b, int c) {
    
        int rightmostA = a % 10;
        int rightmostB = b % 10;
        int rightmostC = c % 10;

       
        return (rightmostA == rightmostB) || (rightmostA == rightmostC) || (rightmostB == rightmostC);
    }}
   


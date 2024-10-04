import java.util.Scanner;
public class secswap {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping a"+a);
        System.out.println("after swapping b"+b);
     
    }
    
}

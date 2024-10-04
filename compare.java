import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is less or equal to b");
        }
        
    }
    
}

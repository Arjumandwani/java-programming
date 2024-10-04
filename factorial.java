import java.util.Scanner;
public class factorial {
    public static void main(String[]args){
        int a,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number for factorial");
        a=sc.nextInt();
        
        while(a>0)
        {
         fact=fact*a;
         a--;
        }

    
    System.out.println("factorial of a number is " +fact);
    
}
}
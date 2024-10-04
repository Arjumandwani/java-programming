import java.util.Scanner;
public class evenodd {
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    
}

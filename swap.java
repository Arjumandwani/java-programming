import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("enter Second number");
        b=sc.nextInt();
        temp=a;
       a=b;
       b=temp;
       System.out.println("a after swapping"+a);
       System.out.println("b after swapping"+b);
       

       
        

    }
}

import java.util.Scanner;

public class secondrightmost {
    public static void main(String[] args) {
        int a,b,c;
            
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
   a= sc.nextInt();
System.out.println("enter second number");
b=sc.nextInt();
System.out.println("enter third number");
c=sc.nextInt();
boolean result= checkRightmost( a,b,c);
System.err.println("have same rightmost digits"+result);
    
        
    }
    public static boolean checkRightmost(int num1,int num2,int num3){
        int rightmostA=num1%10;
        int rightmostB=num2%10;
        int rightmostC=num3%10;
        return  (rightmostA==rightmostB||rightmostB==rightmostC||rightmostC==rightmostA);

    }
    

  
    
    
}

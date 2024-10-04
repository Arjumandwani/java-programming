import java.util.Scanner;
public class xandycoordinates {
    public static void main(String[] args) {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x coordinate");
        x=sc.nextInt();
        System.out.println("enter second number");
        y=sc.nextInt();
        if(x==0&&y==0)
        {
System.out.println("point lies in the origin");
        }
        else if(x>0&&y>0)
        {System.out.println("point lies in the ist qaudrant");

        }
        else if(x<0&&y>0)
        {
            System.out.println("point lies in the second quadrant");
        }
        else if(x<0 &&y<0)
        {
            System.out.println("point lies in the third quadrant");
        }
        else{
            System.out.println("point lies in the fourt quadrant");
        }

    }
}

import java.util.Scanner;



public class arper {
    public static void main(String[] args) {
        int len,br,area,peri,r;
        Scanner sc=new Scanner(System.in);
     
        
        System.out.println("enter length");
        len=sc.nextInt();
        System.out.println("enter breadth");
        br=sc.nextInt();
        System.out.println("enter radius of Circle");
        r=sc.nextInt();
        area=len*br;
        peri=2*(len+br);
    
        System.out.println("area of rectangle"+area);
        System.out.println("perimeter of rectangle"+peri);
        System.out.println("area of circle is"+3.14*r*r);
        System.out.println("perimeter of circle is"+2*3.14*r);

    }
    
}

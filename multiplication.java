import java.util.Scanner;
public class multiplication {
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];
    void getdata()
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values for first matrix");
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            a[i][j]=sc.nextInt();
        }
        System.out.println("enter values for second matrix");
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            b[i][j]=sc.nextInt();
        }
    }
  
   
      
   
    void mult(){
        int k;
        for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
        {
        c[i][j]=0;
        for(k=0;k<3;k++)  
            c[i][j]=c[i][j]+a[i][k]*a[k][j];
    
        }
        System.out.println("mul is");
        for(int i=0;i<3;i++)
        
for(int j=0;j<3;j++)
System.out.print(c[i][j]+"  ");
System.out.println();
        }
    }
class aru{
public static void main(String []args)
{
multiplication aa=new multiplication();
aa.getdata();
aa.mult();
}
}
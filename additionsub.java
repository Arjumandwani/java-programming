import java.util.Scanner;
class additionsub{
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3];
    void getdata()
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        i=j=0;
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            System.out.println("Enter number for first array");
            a[i][j]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            System.out.println("enter number for second array");
            b[i][j]=sc.nextInt();
        }
    }
    void add()
    {
        int i,j;
        i=j=0;
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            c[i][j]=b[i][j]+a[i][j];
        }
    }
    void putdata()
    {
        int i,j;
        i=j=0;
        for(i=0;i<3;i++)
        for(j=0;j<3;j++)
        {
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
    }
}class anand{
    public static void main(String[] args) {
        additionsub aa=new additionsub();
        aa.getdata();
        System.out.println("addition of array is");
        aa.add();
        aa.putdata();
        
    }

}


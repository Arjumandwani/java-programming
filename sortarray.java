import java.util.Scanner;
public class sortarray {
    int a[]=new int[10];
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println("enter number");
            a[i]=sc.nextInt();
        }
    }
    void sort()
    {
        int i,j,t;
        for(i=0;i<9;i++)
        for(j=i+1;j<10;j++)
        {if(a[i]>a[j])
            {
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }

        }
    }
    void putdata()
    {
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}
    class code{
        public static void main(String[] args) {
            sortarray aa=new sortarray();
            aa.getdata();
            System.out.println("Unsorted array");
            aa.putdata();
            System.out.println("sorted array");
            aa.sort();
            aa.putdata();
            

        }
    }



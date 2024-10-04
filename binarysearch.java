import java.util.Scanner;
public class binarysearch {
    int a[]=new int[10];
    int key;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        {
            System.out.println("enter number");
            for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
            }
            System.out.println("enter number to search");
            key=sc.nextInt();
        }
    }
    void search()
    {
        int i=0;
        int j=4;
        int flag=0;
        int pos=0;
        while(i<=j&&flag==0)
        {int mid=i+(j-i)/2;
            if(key==a[mid])
            {flag=1;
                pos=mid+1;
            }
            else if(key<a[mid])
            {
                j=mid-1;
            }
            else{
                i=mid+1;
            }

        }
  if(flag==1)
{
    System.out.println(" number found"+pos);
}
else{
    System.out.println("no number found ");
}  }
public static void main(String[] args) {
  binarysearch  aa=new binarysearch();
  aa.getdata();
  aa.search();
    
}
    
}

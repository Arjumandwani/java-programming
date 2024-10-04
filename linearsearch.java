import java.util.Scanner;
class linearsearch{
    int a[]=new int[10], key;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("enter number");
            a[i]=sc.nextInt();
        }
        System.out.println("enter number to search");
        
            key=sc.nextInt();
        }
        void search()
        {
            int i,flag=0,pos=0;
            for(i=0;i<5 && flag==0;i++)
            {
                if(a[i]==key)
                {
                    flag=1;
                    pos=i+1;
                }
            }
            if(flag==1)
            {
                System.out.println("number found at"+pos);
            }
            else{
                System.err.println("number not found");
            }
        }
    }
    
        class demo{
            public static void main(String[] args) {
                linearsearch aa=new linearsearch();
                aa.getdata();
                aa.search();

                
            }}
    
    


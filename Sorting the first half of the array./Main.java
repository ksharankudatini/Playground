import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    a[i]=in.nextInt();
    }
    int front=0;
    int end;
    if(n%2==0)
    {
    end=n-1;
    }
    else{
    end=n-2;
    }
    
    int mid=(front+end)/2;
    for(int i=0;i<mid;i++)
    {
    for(int j=0;j<mid;j++)
    {
    if(a[j]>a[j+1])
    {
    int temp=a[j];
      a[j]=a[j+1];
      a[j+1]=temp;
    }
    }
    }
    for(int i=0;i<n;i++)
    {
    System.out.print(a[i]+" ");
    }
  }
}
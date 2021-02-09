import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    a[i]=in.nextInt();
    }
  fh(a,n);
    sh(a,n);
    for(int i=0;i<n;i++)
    {
    System.out.print(a[i]+" ");
    }
  }
  public static void fh(int a[],int n)
  {
  int front=0;
    int end;
    if(n%2==0)
    {
    end=n-1;
    }
    else
    {
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
  }
  public static void sh(int a[],int n)
  {
   int end=n-1;
    int front=0;
    int mid=(front+end)/2;
    if(n%2==0)
    {
    mid=mid;
    }
    else
    {
    mid=mid-1;
    }
    for(int i=mid;i<end;i++)
    {
    for(int j=mid+1;j<end;j++)
    {
    if(a[j]<a[j+1])
    {
    int temp=a[j];
      a[j]=a[j+1];
      a[j+1]=temp;
    }
    }
    }
  }
}
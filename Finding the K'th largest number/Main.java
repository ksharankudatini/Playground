import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
      a[i]=in.nextInt();
      }
      int k=in.nextInt();
      sort(a,n);
       
        System.out.print(a[n-k]);
        
    }   
public static void sort(int a[],int n)
{
for(int si=0;si<n;si++)
{
int mi=min(a,n,si);
  swap(a,si,mi);
}
}
  public static void swap(int a[],int si,int mi)
  {
  int temp=a[si];
    a[si]=a[mi];
    a[mi]=temp;
  }
  public static int min(int a[],int n,int si)
  {
  for(int i=si+1;i<n;i++)
  {
  if(a[si]>a[i])
  {
  si=i;
  }
  }
    return si;
  }
}
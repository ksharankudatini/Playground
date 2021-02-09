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
    int sq[]=new int[n];
    most(a,n,sq);
  }
  public static void most(int a[],int n,int sq[])
  {
  int c=1;
    int d;
    int k=0;
    int max_c=0;
    for(int i=0;i<n;i++)
    {
    for(int j=i+1;j<n;j++)
    {
    if(a[i]==a[j])
    {
    c++;
    }
    }
      sq[i]=c;
      c=1;
    }
    for( d=0;d<n;d++)
    {
    if(sq[d]>max_c)
    {
    max_c=sq[d];
      k=d;
    }
    }
    System.out.println(a[k]);
  }
}
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int sum=0;
    int t=0;
    int a[]=new int[n];
   int seq_i=0;
    int start_i=0;
    for(int i=0;i<n;i++)
    {
    a[i]=in.nextInt();
    }
    int sq[]=new int[n*2];
    for(int i=0;i<n-1;i++)
    {
    if(a[i]>a[i+1])
    {
      sq[seq_i]=start_i;
      seq_i++;
      sq[seq_i]=i;
      seq_i++;
      start_i=i+1;
    }
    }
    if(start_i!=n-1)
    {
    sq[seq_i]=start_i;
      seq_i++;
      sq[seq_i]=n-1;
      seq_i++;
    }
    if(start_i==n-1)
    {
    sq[seq_i]=start_i;
      seq_i++;
      sq[seq_i]=n-1;
      seq_i++;
    }
    for(int i=0;i<seq_i-1;i=i+2)
    {
    int s_i=sq[i];
      int e_i=sq[i+1];
      for(int j=s_i;j<=e_i;j++)
      {
        sum=sum+a[j];
      }
      if(sum>t)
      {
      t=sum;
      }
      sum=0;
    }
    System.out.println(t);
  }
}
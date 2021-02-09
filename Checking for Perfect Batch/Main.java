import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in= new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
    arr[i]=in.nextInt();
    }
    perfect(arr,n);
  }
  public static void perfect(int arr[],int n)
  {
    int sum1=arr[0]+arr[1]+arr[2];
  int sum2=arr[3]+arr[4]+arr[5];
    if(sum1==sum2)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}
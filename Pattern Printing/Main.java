import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in=new Scanner(System.in);
      int r=in.nextInt();
      int c=in.nextInt();
      for(int i=1;i<=r;i++)
      {
      for(int j=c;j>c-i;j--)
      {
      System.out.print(j);
      }
        for(int k=1;k<=c-i;k++)
        {
        System.out.print(r-i+1);
        }
        System.out.println();
      }
    }
}
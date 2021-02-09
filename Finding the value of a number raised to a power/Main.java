import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in=new Scanner(System.in);
      int b=in.nextInt();
      int e=in.nextInt();
      int s=1;
      for(int i=1;i<=e;i++)
      {
      s=s*b;
      }
      System.out.println(s);
    }
}
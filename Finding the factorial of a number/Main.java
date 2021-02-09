import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    System.out.println(r(n));
    
  }
  public static int r(int n)
  {
    int s=1;
  while(n>1)
  {
  s=s*n;
    n--;
  }
    return s;
  }
}
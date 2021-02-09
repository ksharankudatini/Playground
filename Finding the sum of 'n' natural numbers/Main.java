import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(natural(n));
    }
  public static int natural(int n)
  {
  int s=0,c=0;
    while(c<=n)
    {
    s=s+c;
      c++;
    }
    return s;
  }
}
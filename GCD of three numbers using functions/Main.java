import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int result=great(n1,n2);
      System.out.println(great(result,n3));
	}
  public static int great(int n1,int n2)
  {
  int min_e;
    if(n1<n2)
    {
    min_e=n1;
    }
    else
    {
    min_e=n2;
    }
    while(min_e>=0)
    {
    if((n1%min_e==0)&&(n2%min_e==0))
      return min_e;
    }
    min_e--;
    return 0;
  }
    
}
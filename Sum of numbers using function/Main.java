import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(sum(n));
	}
  public static int sum(int m)
  {
    int s=0;
  for(int i=1;i<=m;i++)
  {
  s=s+i;
  
  }
    return s;
  }
}
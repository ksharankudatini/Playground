import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int k=1;
      int n = in.nextInt();
      for(int i=1;i<=n;i++)
        {
      for(int j=1;j<=i;j++)
        {
      if(k==1)
        {
      System.out.print("*");
        k=2;
      }
        else
          {
          System.out.print("#");
          k=1;
          }
      }
        System.out.println();
      }
    }
}
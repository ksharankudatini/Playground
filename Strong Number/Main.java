import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int m=n;
      int sum=0;
      while(n>0)
      {
      int r=n%10;
        int fac=1;
        for(int i=1;i<=r;i++)
        {
        fac=fac*i;
        }
        sum = sum + fac;
        n = n/10;
      }
      if(m==sum)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}
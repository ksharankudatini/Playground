import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = n;
      int t = n;
      int count = 0;
      while(n>0)
      {
      count++;
        n = n/10;
      }
      
      int total=0;
      
      while(m>0)
      {
        int sum=1;
      int r = m%10;
        for(int i=1;i<=count;i++)
        {
        sum = sum*r;
        }
        m=m/10;
        total = total+sum;
        
      }
      if(total==t)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}
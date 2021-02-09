import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=n/10,b=n%10;
      int sum=a+b;
      System.out.println(sum);
      
	}
}
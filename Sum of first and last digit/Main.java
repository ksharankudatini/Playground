import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int l = n % 10;
      while(n>9)
      {
      n = n/10;
      }
      int sum = n+l;
      System.out.println(sum);
	}
}
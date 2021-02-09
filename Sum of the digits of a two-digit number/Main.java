import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int f = n/10,l = n%10;
      int sum = f+l;
      System.out.print(sum);
	}
}
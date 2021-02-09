import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int c=0;
      for(int i=1;i<=100;i++)
      {
        if(i%2==1)
          {
          c++;
      if(c<=n)
        System.out.println(i);
        }
      }
	}
}
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int f = n/100,m = (n/10)%10,l = n%10;
    int sum = f + (m*10) + (l*100);
    System.out.println(sum);
  }
}
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sh = new Scanner(System.in);
      int n = sh.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++)
        {
      a[i] = sh.nextInt();
      }
      int l = a[0];
      for(int i=1;i<n;i++)
        {
      if(a[i] > l)
        {
      l=a[i];
      }
      }
      System.out.println(l);
    }
}
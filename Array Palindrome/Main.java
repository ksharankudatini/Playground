import java.util.*;

class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      int b[] = new int[n];
      
      for(int i=0;i<n;i++)
        {
      a[i] = in.nextInt();
      }
      
      int l=0,r=n-1;
      while(l<n)
        {
      b[l] = a[r];
        l++;
        r--;
      }
      if(Arrays.equals(a,b))
        {
      System.out.println("Yes");
      }
      else
        {
      System.out.println("No");
      }
     
    }
}
import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt(); 
      int a[] = new int[n];
      for(int i=0;i<n;i++)
        {
      a[i] = in.nextInt();
      }
      int count=1;
      for(int i=0;i<n;i++)
        {
        if(count == i)
          {
        System.out.println(count);
          break;
        }
        for(int j=0;j<n;j++)
          {
        if(a[j]==count)
          {
        count++;
          break;
        }
        }
        
      
      }
    }
}
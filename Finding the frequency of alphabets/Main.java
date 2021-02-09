import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      StringBuilder sb = new StringBuilder(s);
      int n = sb.length();
      int a[] = new int[70];
      for(int i=0;i<70;i++)
        {
      a[i]  = 0;
      }
      for(int i=0;i<n;i++)
        {
        
      if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
        {
      int off = sb.charAt(i) - 'A';
        char c = (char)(off + 'a');
        sb.setCharAt(i,c);
      }
        
        if(sb.charAt(i)>='a' && sb.charAt(i)<='z')
          {
        int off = sb.charAt(i) - 'a';
          a[off]++;
        }
      }
      for(int i=0;i<n;i++)
        {
      char ch = sb.charAt(i);
        int off = ch - 'a';
        if(a[off] != 0)
          {
        System.out.print(ch+""+a[off]+" ");
          a[off] = 0;
        }
      }
    }
}
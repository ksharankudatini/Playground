import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      int n = s.length();
      int a[] = new int[26];
      for(int i=0;i<26;i++)
        {
      a[i] = 0;
      }
      for(int i=0;i<n;i++)
        {
      char ch = s.charAt(i);
        if(ch>'A' && ch<='Z')
          {
        int off = ch - 'A';
          a[off]++;
        }
        else if(ch>='a' && ch<='z')
          {
        int off = ch - 'a';
          a[off]++;
        
        }
      }
        for(int i=0;i<26;i++)
          {
        if(a[i] == 0)
          {
        char ch = (char)('a' + i);
          System.out.print(ch+" ");
          
        }
        }
      }
    }

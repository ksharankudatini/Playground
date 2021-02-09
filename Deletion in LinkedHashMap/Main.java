import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      LinkedHashMap<String,String> l=new LinkedHashMap<String,String>();
      String name,mark;
      System.out.print("Enter the number of values to be inserted in map:");
      int n=Integer.parseInt(br.readLine());
      System.out.println(n);
      for(int i=0;i<n;i++)
      {
      name=br.readLine();
        mark=br.readLine();
        l.put(name,mark);
        
      }
      System.out.println(l);
      System.out.print("Enter the index to be removed:");
      String r=br.readLine();
      System.out.println(r);
      l.remove(r);
      System.out.println(l);
      System.out.println("Size of map is : "+l.size());
    }
}
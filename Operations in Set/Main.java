import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet l=new LinkedHashSet();
      String z=br.readLine();
      String arr[]=z.split(",");
      for(int i=0;i<arr.length;i++)
      {
      l.add(arr[i]);
      }
      System.out.println(l);
      System.out.print("Enter the value to be deleted: ");
      String k=br.readLine();
      System.out.println(k);
      l.remove(k);
      System.out.println(l);
      System.out.print("Enter the value to be added: ");
      String f=br.readLine();
      System.out.println(f);
      l.add(f);
      System.out.println(l);
    }
}
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet l=new LinkedHashSet();
      String n=br.readLine();
      String arr[]=n.split(",");
      for(int i=0;i<arr.length;i++)
      {
      l.add(arr[i]);
      }
      System.out.println(l);
    }
}
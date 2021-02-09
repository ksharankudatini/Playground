import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      TreeSet t=new TreeSet();
      String m=br.readLine();
      String arr[]=m.split(",");
      for(int i=0;i<arr.length;i++)
      {
      t.add(arr[i]);
      }
      System.out.println(t);
      Object arr1[]=t.toArray();
      int n=arr1.length-1;
      while(t.isEmpty()==false)
      {
        Object z=arr1[n];
      t.remove(z);
        System.out.println(t);
        --n;
      }
    }
}
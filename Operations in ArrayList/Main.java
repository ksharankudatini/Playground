import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      ArrayList al=new ArrayList();
      int b=0;
      while(b!=5)
      {
      System.out.println("Choose any one:");
        System.out.println("1.Insert\n2.delete\n3.Display\n4.Exit");
        int c=Integer.parseInt(br.readLine());
        switch(c)
        {
          case 1: String j=br.readLine();
                  String arr[]=j.split(",");
            for(int z=0;z<arr.length;z++)
            {
            al.add(arr[z]);
            }
           
            break;
          case 2:System.out.print("Enter the index value to be deleted:"); 
            int d=Integer.parseInt(br.readLine());
            System.out.println(d);
            al.remove(d);
            break;
          case 3: System.out.println(al);
            break;
          case 4:  b=5;
            break;
        }
      }
    }
}
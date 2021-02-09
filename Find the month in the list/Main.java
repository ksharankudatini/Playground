import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
      LinkedList ll=new LinkedList();
      String m=bf.readLine();
      String arr[]=m.split(",");
      for(int i=0;i<arr.length;i++)
      {
      ll.add(arr[i]);
      }
      System.out.println(ll);
      System.out.println("Size of the linked list: "+ll.size());
      System.out.println("Is LinkedList empty? "+ll.isEmpty());
      String k=bf.readLine();
      System.out.println("Does LinkedList contains "+k+"?");
      System.out.println(ll.contains(k));
    }
}
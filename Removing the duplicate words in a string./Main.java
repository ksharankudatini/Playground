import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    String a[] = s.split(" ");
    for(int i=0;i<a.length;i++)
      {
      if(a[i] != null)
    for(int j=i+1;j<a.length;j++)
      {
    if(a[i].equals(a[j]))
      {
    a[j] = null;
    }
    }
    }
    for(int i=0;i<a.length;i++)
      {
    if(a[i] != null)
      {
    System.out.print(a[i]+" ");
    }
    }
  }
}
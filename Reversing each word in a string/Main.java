import java.util.Scanner;
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    rs(s);
  }
  public static void rs(String s)
  {
  String words[]=s.split(" ");
    String reversedstring="";
    for(int i=0;i<words.length;i++)
    {
    String word=words[i];
      String reversedword="";
      for(int j=word.length()-1;j>=0;j--)
      {
      reversedword=reversedword+word.charAt(j);
      }
      reversedstring=reversedstring+reversedword+' ';
    }
    System.out.println(reversedstring);
  }
}
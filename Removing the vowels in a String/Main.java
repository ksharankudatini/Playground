import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    StringBuilder temp = new StringBuilder();
    int n = s.length();
    for(int i=0;i<n;i++)
      {
    char ch = s.charAt(i);
      if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
        {
      temp.append(ch);
      }
    }
    System.out.println(temp);
  }
}
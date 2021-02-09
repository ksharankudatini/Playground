import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    double ad=0,bd=0;
    int n=s.length();
    int flag=0;
    for(int i=0;i<n;i++)
    {
      if(s.charAt(i)=='.')
      {
    flag=1;
      }
    }
    if(flag==1)
    {
    for(int i=n-1;s.charAt(i)!='.';i--)
    {
    ad=(ad/10)+(s.charAt(i)-'0');
    }
      ad=ad/10;
    
      for(int i=0;s.charAt(i)!='.';i++)
      {
      bd=(bd*10)+(s.charAt(i)-'0');
      }
    }
    else
    {
    for(int i=0;i<n;i++)
    {
    ad=(ad*10)+(s.charAt(i)-'0');
    }
    }
    double sum=ad+bd;
    System.out.printf("%f",sum);
  }
}

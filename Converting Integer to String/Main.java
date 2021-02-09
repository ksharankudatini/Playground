import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int temp=n,c=0;
    if(n<0)
    {
    n=n*-1;
    }
    while(n>0)
    {
    c++;
      n/=10;
    }
    if(temp<0)
    {
    c=c+1;
    }
    char arr[]=new char[c];
    if(temp<0)
    {
    temp=temp*-1;
      arr[0]='-';
    }
    c--;
    while(temp>0)
    {
    char ch=(char)((temp%10)+'0');
      arr[c]=ch;
      c--;
      temp/=10;
    }
    System.out.println(arr);
  }
}

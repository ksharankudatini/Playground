import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int a1[][]=new int[r][c];
    int k=1;
    for(int i=0;i<r;i++)
    {
    for(int j=0;j<c;j++)
    {
    a1[i][j]=in.nextInt(); 
    }
    }
    int a2[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
    for(int j=0;j<c;j++)
    {
    a2[i][j]=in.nextInt();
    }
    }
    for(int i=0;i<r;i++)
    {
    for(int j=0;j<c;j++)
    {
    if(a1[i][j]!=a2[i][j])
    {
    k=0;
      break;
    }
    }
    }
    if(k==1)
    {
    System.out.println("Yes");
    }
    else
    {
    System.out.println("No");
    }
  }
}
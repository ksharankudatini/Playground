import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in=new Scanner(System.in);
    int r_s=in.nextInt();
    int c_s=in.nextInt();
    int a1[][]=new int[r_s][c_s];
    int a2[][]=new int[r_s][c_s];
     int s[][]=new int[r_s][c_s];
    for(int i=0;i<r_s;i++)
    {
    for(int j=0;j<c_s;j++)
    {
    a1[i][j]=in.nextInt();
    }
    }
     for(int i=0;i<r_s;i++)
    {
    for(int j=0;j<c_s;j++)
    {
    a2[i][j]=in.nextInt();
    }
    }
    sub(s,r_s,c_s,a1,a2);
  }
  public static void sub(int s[][],int r_s,int c_s,int a1[][],int a2[][])
  {
    for(int i=0;i<r_s;i++)
    {
    for(int j=0;j<c_s;j++)
    {
    s[i][j]=a1[i][j]-a2[i][j];
    }
    }
      for(int i=0;i<r_s;i++)
    {
    for(int j=0;j<c_s;j++)
    {
    System.out.print(s[i][j]+" ");
    }
        System.out.println();
    }
  }
}
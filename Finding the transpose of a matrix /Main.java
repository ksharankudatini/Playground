import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
     Scanner in=new Scanner(System.in);
    int r_s=in.nextInt();
    int c_s=in.nextInt();
    int a[][]=new int[r_s][c_s];
    int t[][]=new int[c_s][r_s];
    for(int i=0;i<r_s;i++)
    {
    for(int j=0;j<c_s;j++)
    {
    a[i][j]=in.nextInt();
    }
    }
     for(int i=0;i<r_s;i++)
    {
    for(int j=0;j<c_s;j++)
    {
    t[j][i]=a[i][j];
    }
    }
     for(int i=0;i<c_s;i++)
    {
    for(int j=0;j<r_s;j++)
    {
    System.out.print(t[i][j]+" ");
    }
       System.out.println();
    }
  }
}
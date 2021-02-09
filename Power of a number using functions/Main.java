import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
  int b=in.nextInt();
  int e=in.nextInt();
  int r=pow(b,e);
  System.out.println(r);

}
  public static int pow(int b,int e)
  {
  int rem=1;
    for(int i=1;i<=e;i++)
    {
    rem=rem*b;
    }
    return rem;
  }

}
  
import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int result=great(n1,n2);
      System.out.println(great(result,n3));
	}
  public static int great(int n1,int n2)
  {
  int r;
    if(n1>n2)
    {
    r=n1;
    }
    else
     { 
      r=n2;
    }
    return r;
  }
  
}
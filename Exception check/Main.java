import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      // type your code here
     Scanner in=new Scanner(System.in);
     
     try
     {
     int  a=in.nextInt();
     System.out.println(a);
     }
     catch(InputMismatchException f )
     {
     System.out.println("Input Mismatch Exception occurred");
     }
   }
}
import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      Scanner in=new Scanner(System.in);
      int mark=in.nextInt();
      if(mark>=85)
         System.out.println("A");
      else if(mark>=75)
         System.out.println("b");
      else if(mark>=65)
         System.out.println("c");
      else if(mark>=55)
         System.out.println("d");
      else if(mark>=45)
         System.out.println("e");
      else
         System.out.println("Fail");
      
      
		// Type your code here
    }
}
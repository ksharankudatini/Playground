import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sh = new Scanner(System.in);
      int n = sh.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++)
        {
      a[i] = sh.nextInt();
      }
      int s1 = sh.nextInt();
      int s2 = sh.nextInt();
      System.out.println(search(a,s1));
      System.out.println(search(a,s2));
      
    }
  public static int search(int a[],int key)
    {
   for(int i=0;i<a.length;i++)
        {
      if(a[i] == key)
        {
       return i; 
      } 
     }
    return -1;
      }
}
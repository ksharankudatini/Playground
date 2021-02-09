import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_s=in.nextInt();
      int arr[]=new int[arr_s];
      for(int i=0;i<arr_s;i++)
      {
      arr[i]=in.nextInt();
      }
      int max_num=0;
      if(arr[0]>arr[1])
      {
      max_num=0;
      }
      else
      {
      max_num=1;      
    }
  for(int i=2;i<arr_s;i++)
  {
  if(arr[max_num]<arr[i])
  {
  max_num=i;
  }
  }
  System.out.println(max_num);
}
}


















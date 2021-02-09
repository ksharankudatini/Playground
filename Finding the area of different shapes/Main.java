import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in=new Scanner(System.in);
      int o=in.nextInt();
      switch(o)
      {
        case 1: int side=in.nextInt();
        int area_s=side*side;
        System.out.println(area_s);
        break;
        case 2: int l=in.nextInt();
        int b=in.nextInt();
        int area_r=l*b;
        System.out.println(area_r);
        break;
        case 3: int br=in.nextInt();
        int h=in.nextInt();
        int area_t=(br*h)/2;
        System.out.println(area_t);
        break;
        case 4: int r=in.nextInt();
        double area_c=3.14*r*r;
        System.out.println(area_c);
        break;
      }
    }
}
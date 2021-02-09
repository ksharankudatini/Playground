class MyModel1 {
     //write your logic here
  int camera=2;
  int display=5;
  public void MyModel()
  {
  System.out.println("Features of MyModel 1");
    System.out.println("Camera mega pixels: "+camera);
  }
}
class MyModel2 extends MyModel1 {
     //write your logic here
  int camera=5;
  String lock="Fingerprint";
  public MyModel2()
  {
  System.out.println("Features of MyModel 2");
    System.out.println("Camera mega pixels: "+camera);
    System.out.println("Lock mechanism: "+lock);
    System.out.println("Display size: "+display);
  }
}
class MyModel2T extends MyModel2 {
     //write your logic here
  int camera=16;
  int display=6;
   public MyModel2T()
  {
  System.out.println("Features of MyModel 2T");
    System.out.println("Camera mega pixels: "+camera);
    System.out.println("Lock mechanism: "+lock);
    System.out.println("Display size: "+display);
  }
  
}
public class Main 
{
    public static void main(String[] args) 
    {
          //write your logic here
      MyModel1 k=new MyModel1();
      k.MyModel();
     MyModel2T m=new MyModel2T();
    }
}
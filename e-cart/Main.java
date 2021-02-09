import java.util.Scanner;//import required packages here

class Item
{
  private int price;
  public void item(int price)
  {
  this.price=price;
  }
  //create various method to return attribute value(s)
}
   
class Customer extends Item
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void customer(String product,int quantity)
  {
  this.product=product;
  this.quantity=quantity;
  }
}

class Bill extends Customer
{
  //implement your logic to calculate total price
  int t;
  public void bill(int price,int quantity)
  {
  this.t=price*quantity;
  }
  public int getBill()
  {
  return this.t;
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    String pro=in.next();
    int rate=in.nextInt();
    int qua=in.nextInt();
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    i.item(rate);
    c.customer(pro,qua);
    obj.bill(rate,qua);
    System.out.println("Total Price is : "+obj.getBill());
  }
}
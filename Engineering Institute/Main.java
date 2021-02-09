import java.util.Scanner;//import required packages

class Faculty
{
  int i;
  public void salary(int i)
  {
    this.i=i;
    //write your Faculty class statements
  }
  public int getSalary()
  {
  return this.i;
  }
}
class CSE extends Faculty
{
  public void salary(int i)
  {
    //write your CSE class statements
    this.i=3000+i;
  }
   public int getSalary()
  {
  return this.i;
  }
}
class IT extends Faculty
{
  public void salary(int i)
  {
    //write your IT class statements
    this.i=5000+i;
  }
   public int getSalary()
  {
  return this.i;
  }
}
class ECE extends Faculty
{
  public void salary(int i)
  {
    //write your ECE class statements
    this.i=4500+i;
  }
   public int getSalary()
  {
  return this.i;
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int s=in.nextInt();
    Faculty f=new Faculty();
    CSE cs=new CSE();
    IT it=new IT();
    ECE ec=new ECE();
    f.salary(s);
    cs.salary(s);
    it.salary(s);
    ec.salary(s);
    System.out.println("Base Salary: "+f.getSalary());
    System.out.println("CSE Faculty: "+cs.getSalary());
    System.out.println("IT Faculty: "+it.getSalary());
    System.out.println("ECE Faculty: "+ec.getSalary());
    //implement your required concept here
  }
}
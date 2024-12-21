abstract class AbstractClass //class has to be abstract if any one method is abstract method, vice versa not mandatory 
{
  public abstract void F1();// to be overridden in inherited class
  public void demo()
  {
    System.out.println("AbstractClass demo");
  }
}

class ExtendedClass extends AbstractClass
{
  public void F1()
  {
    //implementation
    System.out.println("F1() of ExtendedClass ");
  }
}

class Executer
{
   public static void main(String a[])
   {
      //AbstractClass ob = new AbstractClass()  --> will throw error
      AbstractClass ob = new ExtendedClass();
      ob.F1(); // prints  F1() of ExtendedClass
   }
}

public class Practice
{
    class InnerClass
    {
        void f1()
        {
            System.out.println("f1()");
        }
        void f2()
        {
            System.out.println("f2()");
        }
    }
}

final class Handler
{
    public static void main(String ar[])
    {
        System.out.println("Main");
        //ok
    }
}
public class Practice
{
    void f1()
    {
        System.out.println("Practice f1()");

    }
    void f2()
    {
        System.out.println("Practice f2()");
    }
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
        Practice p = new Practice();
        Practice.InnerClass ic =p.new InnerClass();
        ic.f1();
    }
}
interface Actions_interface
{
    void run();
    void dance();
}

class Implementor_of_inteface implements Actions_interface
{
    public void run()
    {
        System.out.println("Running");
    }
    public void dance()
    {
        System.out.println("dancing");
    }
}

abstract class Practice_Abstract
{
    void demo()
    {
        System.out.println("This is non-abstract method inside a abstract class");
    }
    abstract void demo2();
}

class Extended_Practice extends Practice_Abstract
{
    void demo2()
    {
        System.out.println("abstract method's implementation");
    }
}

public class Practice {

    public static void main(String[] args) {

        System.out.println("Main, trying ");        
        java.awt.Toolkit.getDefaultToolkit().beep();
        Practice_Abstract ob = new Extended_Practice();
        ob.demo();
        ob.demo2();

        Practice_Abstract anonyObj = new Practice_Abstract()
        {
            void  demo2()
            {
                System.out.println("ano");
            }
        };
        anonyObj.demo();
        Implementor_of_inteface obj2 = new Implementor_of_inteface();
        obj2.dance();
        obj2.run();

        System.out.println("check");
        double d = 6.00/4.00;
        int  i = 6/4;
        double res = d + i;
        System.out.println(res);
    }     
}




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
        System.out.println("Main");
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
    }     
}

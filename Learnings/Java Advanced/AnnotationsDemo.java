public class AnnotationsDemo{

    public void demo()
    {
        System.out.println("AnnotationsDemo - demo()");
    }

}

// @Deprecated - to show/warn that context identifier is deprecated or better alternative is available

class AnnotationsDemo_child extends AnnotationsDemo
{
    @Override
    public void demo()
    {
        //this tells compiler explicitly that we are overriding the method
        System.out.println("Annotations child - demo ");
    
    }
}

class AnnotationsDemo_Handler
{
 
    public static void main(String arg[])
    {
        System.out.println("Main()");

        AnnotationsDemo_child ob = new AnnotationsDemo_child();
        ob.demo();
    }
}

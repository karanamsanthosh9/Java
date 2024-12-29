/*
 * Types of interfaces
 * -------------------
 * 1)Normal -> more than one method
 * 2)Functional(Single Abstract Method SAM) -> single method
 * 3)Marker interface  -> no methods....
 * used for serialization(storing obj address) and deserialization(getting stored addresses, say to resume the game)
 * 
 */
//Lambda expressions are used in 2)Functional interfaces.

//to explicitly say compiler that it is a functional interface
@FunctionalInterface
public interface LambdaExpressionDemo 
{

        void show(); // == public abstract show();
        /*
         * {
         * //some code ==> error, interfaces(==public abstract classes can have only methods declarations)
         * }
         */
        //void newfunc(); shows error in interface name , as only one method allowed in FunctionalInterface
}

interface LambdaExpressionDemo2 {

        void show2(int i);

}




class LambdaExpressionDemo_Handler
{
    public static void main(String[] args) {
        //i want to use LambdaExpressionDemo, but it is an interface, so , i have to implement it in a class and have to use, instead of that i can use anonymous class
        LambdaExpressionDemo_Handler handler = new LambdaExpressionDemo_Handler();
        handler.usage1();
        handler.usage2();
        handler.usage3();
    }

    void usage1()
    {
       //LambdaExpressionDemo obj  = new LambdaExpressionDemo(); error, cant create obj with interface directly;
    }

    void usage2()
    {
        LambdaExpressionDemo obj = new LambdaExpressionDemo() 
        {
            //implement the methods logic here
            //@Override
            public void show() {
                System.out.println("Implemented logic in anonymous class");    
            }
        };
        obj.show();
    }
    void usage3()
    {
        //lambda expression
        LambdaExpressionDemo obj = () ->{
            System.out.println("in basic lambda implementation");
        };
        obj.show();
    }
}
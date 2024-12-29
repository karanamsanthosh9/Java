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

public interface LambdaExpressionDemo 
{

        void show(); // == public abstract show();
        /*
         * {
         * //some code ==> error, interfaces(==public abstract classes can have only methods declarations)
         * }
         */
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
    }

    void usage1()
    {
       //ambdaExpressionDemo obj  = new LambdaExpressionDemo(); error, cant create obj with interface directly;
    }

    void usage2()
    {

    }
    void usage3()
    {

    }
}
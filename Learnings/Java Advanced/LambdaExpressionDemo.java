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

@FunctionalInterface
interface LambdaExpressionDemo2 {

        void show2(int i);

}

@FunctionalInterface
interface InterfaceWithReturnValue{
    int add(int p1, int p2);
}

class LambdaExpressionDemo_Handler
{
    public static void main(String[] args) {
        //i want to use LambdaExpressionDemo, but it is an interface, so , i have to implement it in a class and have to use, instead of that i can use anonymous class
        LambdaExpressionDemo_Handler handler = new LambdaExpressionDemo_Handler();
        handler.lambdaExpressions_usage1();
        handler.lambdaExpressions_usage2();
        handler.lambdaExpressions_usage3();
        handler.lambdaExpressions_usage4();
        handler.demoFor_InterfaceWithReturnValue();
    }
    void lambdaExpressions_usage1()
    {
       //LambdaExpressionDemo obj  = new LambdaExpressionDemo(); error, cant create obj with interface directly;
    }
    void lambdaExpressions_usage2()
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
    void lambdaExpressions_usage3()
    {
        //lambda expression
        LambdaExpressionDemo obj = () ->{
            System.out.println("in basic lambda implementation");
        };
        obj.show();

        //what if the single abstract method accepts parameters?, lets see
        LambdaExpressionDemo2 obj2 = (int i) ->{
            System.out.println("in parameterised Lambda expression : " + i);
        };
        obj2.show2(18);
        //as compiler already know it accepts int, we can directly use this
        //LambdaExpressionDemo2 obj2 = i -> { System.out.println("in parameterised Lambda expression : " + i); }

    }
    void lambdaExpressions_usage4()
    { 
        //even reduce code
        LambdaExpressionDemo2 obj2 = i ->System.out.println("in parameterised Lambda expression : " + i);
        obj2.show2(99);
    }
    void demoFor_InterfaceWithReturnValue()
    {
        System.out.println("Demo for InterfaceWithReturnValue");
        InterfaceWithReturnValue obj = new InterfaceWithReturnValue() 
        {
            public int add(int j, int k )
            {
                return  j + k;
            }
        };
        System.out.println(obj.add(12312, 32112));

        //InterfaceWithReturnValue obj2 = (int i , int k) -> return i + k ; //error, return cant be in single line
        //InterfaceWithReturnValue obj2 = (int i , int k) -> {return i + k ;}; //this is valid, but we have better one🙂🙂🙂
        System.out.println("🙂🙂🙂");
        InterfaceWithReturnValue obj2 = (a, b) -> (a + b);
        System.out.println(obj2.add(99,100));
    }
}
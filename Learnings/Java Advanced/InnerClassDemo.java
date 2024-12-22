class InnerClassDemo{

}

class OuterClass
{

    String className = "OuterClass" ;

    OuterClass()
    {
        System.out.println("outer class obj created");
    }
    public void printclassDetails()
    {
        System.out.println("Printing class details : " +  className );
    }

    class InnerClass
    {
        InnerClass()
        {
            System.out.println("Innerclass obj created");
        }
        public void printclassDetails_2()
        {
            className = "InnerClass"
            System.out.println("Printing class details : " +  className );
        }
    }


}


class Implementation
{
    public static void main(String[] a)
    {
        OuterClass obj1 = new OuterClass();
        obj1.printclassDetails();
        //obj1.printclassDetails_2(); --> error....cant call innerClass members/methods with outer class ref var.
        
        //InnerClass obj2 = new InnerClass(); -> error...innerClass needs outerclass obj to be created(if it is non-static method/member)
        OuterClass.InnerClass obj2 = obj1.InnerClass();
    }
}
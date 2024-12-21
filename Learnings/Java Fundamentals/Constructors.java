class Constructors
{
    Constructors()
    {
        System.out.println("constructor is called");
    }
    void doSomething()
    {
        System.out.println("4 + 56 = "  + (4 + 56) );
    }
}


class Main
{
    public static void main(String[] args)
    {
       System.out.println("inside main");
       Constructors c = new Constructors();
       c.doSomething();
        
       DataTypes d = new DataTypes();
    }
}
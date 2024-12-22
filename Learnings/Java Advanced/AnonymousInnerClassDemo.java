

class AnonymousInnerClassDemo
{
    public void printWelcomenote()
    {
        System.out.println("Welcome to AnonymousInnerClassDemo");
    }
}

class Executer
{
    public static void main(String[] a )
    {
        //AnonymousInnerClassDemo anObj = new AnonymousInnerClassDemo();
        //if we want to customize/enhance or override the implemenation of
        // printWelcomenote() we can use inheritance , but without inheritance we can achieve the same using the concept of AnonymousClass
        AnonymousInnerClassDemo anObj = new AnonymousInnerClassDemo()
        {
            public void printWelcomenote()
            {
                System.out.println("Enhanced welcome note from Anonymous class");
            }

        }
        ;
    }
}
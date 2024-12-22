public class AbstractAndAnonymousInnerClass {

}

abstract class AbsClass {
    public abstract void printWelcomenote();

    public abstract void printSysDetails();
}

class AbsClass_Handler {

    public static void main(String[] args) {
        // AbsClass obj = new AbsClass(); --> Error:Cannot instantiate the type AbsClass
        // Instead of extending the abstract class, we can use anonymous inner class to
        // implement the abstact methods of abstract class

        AbsClass obj = new AbsClass() 
        {
            public void printWelcomenote() 
            {
                System.out.println("Welcome to AbsClass -> Welcomenote()");
            }

            public void printSysDetails() 
            {
                System.out.println("Brand : HP | Model :Probook");
            }
        };
        obj.printWelcomenote();
        obj.printSysDetails();
    }
}
public class InterfaceDemo {

}

/*
 * interfaces:
 * methods by default are public abstract;
 * variables -> final and static
 * 
 * type - implementation keyword
 * class using another class - extends
 * class using interface - implements
 * interface using interface - extends
 */

interface x {
    // public abstract void show();
    void show();// no need of public abstract, by defualt interface methods are public abstract

    // int intrfaceVariable; --> error :The blank final field intrfaceVariable may
    // not have been initialized
    // by default interface vairable are final and static(can be accessed without
    // obj i.e className.varName)
    int intrfaceVariable = 99;
}

interface y extends x {
    void show_y();
}

//class InterFaceImplementer implements x, y {
class InterFaceImplementer implements y {
    // it must implement all interface methods(from both x and y), else it will
    // become abstract class
    public void show() {
        System.out.println("InterfaceImplementer show()");
    }

    public void show_y() {
        System.out.println("InterfaceImplementer show_y()");
    }
}

class InterFaceDemo_Handler {
    public static void main(String[] args) {
        InterFaceImplementer inObj = new InterFaceImplementer();
        inObj.show();
        System.out.println("Interface variable : " + x.intrfaceVariable);
        inObj.show_y();
        x xObj = new InterFaceImplementer();
        xObj.show();
        //xObj.show_y(); ->error, x interface is unaware of show_y as it is fn of y(its successor)

    }

}

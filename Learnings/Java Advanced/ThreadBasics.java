
//class A_ThreadBasics

import java.util.concurrent.ThreadLocalRandom;

class A_ThreadBasics extends Thread // now this is a thread, it should have a run method by default
{
    public void run()
    {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hii");
        }
    }
}

class B_ThreadBasics extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class ThreadBasics {

    public static void main(String a[])    
    {
        System.out.println("Main");
        A_ThreadBasics ob_a = new A_ThreadBasics();
        B_ThreadBasics ob_b = new B_ThreadBasics();
        ob_a.start();//this will directly calls the run method
        ob_b.start();
    }
}

//class A_ThreadBasics

import java.util.concurrent.ThreadLocalRandom;

class A_ThreadBasics extends Thread // now this is a thread, it should have a run method by default
{
    public void run()
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hii");
            try
            {
            Thread.sleep(1);
            }catch(Exception e)
            {
                System.out.println("exception :" + e );
            }
        }
    }
}

class B_ThreadBasics extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
            try
            {
            Thread.sleep(1);
            }catch(Exception e)
            {
                System.out.println("exception :" + e );
            }
        }
    }
}

public class ThreadBasics {

    public static void main(String a[])    
    {
        System.out.println("Main");
        A_ThreadBasics ob_a = new A_ThreadBasics();
        B_ThreadBasics ob_b = new B_ThreadBasics();
        System.out.println(ob_a.getPriority());//=> 5, range = 1 to 10
        // we can only suggest scheduler , but can't exactly tell to maintain exact priority
       // ob_a.setPriority(10);
      //  ob_b.setPriority(10);// no guarantee that hello will be printed first, 
        //we can only try to optimize the thread priority
        ob_a.start();//this will directly calls the run method
        ob_b.start();   
    }
}                             
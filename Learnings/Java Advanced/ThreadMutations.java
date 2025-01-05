class Counter implements Runnable 
{

    int counter;
   // public void increment() //
    public synchronized void increment() //synchronized - almost like mutex lock
    {
        for (int i = 0; i < 100000; i++) {
        counter++;
        }
    } 
    public void run()
    {
        increment();
    }   
}

public class ThreadMutations {

    public static void main(String[] args) {
        System.out.println("ThreadMutations main()");
//        Counter c = new Counter();
        Counter c = new Counter();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);

        /*
         * to make sure main thread waits for threads to complete their tasks
         */

        t1.start();
        t2.start();

        try
        {
        //public final void join() throws InterruptedException 
        t1.join();
        t2.join();
        }
        catch(InterruptedException e){System.out.println("Exception :" +e );}

        System.out.println(c.counter);
    }
}
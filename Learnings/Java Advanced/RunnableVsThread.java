class A_RunnableVsThread implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 10; i++) {
                System.out.print("Hello");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Exception :" + e);
                }
        }
    }
}

class B_RunnableVsThread implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 10; i++) {
                System.out.print(" World\n");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Exception :" + e);
                }
        }
    }
}

public class RunnableVsThread {

    public static void main(String[] args) {
        System.out.println("Main of RunnableVsThread");
        Runnable obj_a = new A_RunnableVsThread();
        Runnable obj_b = new B_RunnableVsThread();

        /*
         *
         * Thread t1 = new Thread();
         * Thread t2 = new Thread();
         * t1.start();
         * t2.start();  -> no output, as t1 and t2 are unaware of above objs, so we have a constructor for thread class that takes runnable objs
         * 
         */

        Thread t1 = new Thread(obj_a);
        Thread t2 = new Thread(obj_b);

        t1.start();
        t2.start();

    }
}
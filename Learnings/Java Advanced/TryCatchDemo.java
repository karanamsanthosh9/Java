
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("Try Catch ");
        Demo_TryCatchBlocks tester = new Demo_TryCatchBlocks();
        tester.demo1();
        tester.demo2();
        tester.demo3();
    }
}

class Demo_TryCatchBlocks {
        void demo1() {
            int a = 10;
            int b = 0;

            try {
                b = a / b;
            } catch (Exception e) {
                System.out.println("Exception encountered.....");
                System.out.println(e);
            }
            System.out.println("End of demo1()");
        }

        void demo2() {
            System.out.println("Demo 3");
            int[] arr = new int[5];
            try {
                System.out.println("trying.....");
                System.out.println(arr[0]);
                System.out.println(arr[5]);

            } catch (Exception e) {
                System.out.println("Exception encountered........");
                System.out.println(e);
            }
            System.out.println("End of demo2()");
        }

        void demo3()
        {
            System.out.println("demo3()..........");
            int a=1;
            int b=10;
            int arr[] = new int[5];
            String str = null;
            try
            {
                System.out.println(str.length());
                b = b/a;
                System.out.println(arr[0]);
                System.out.println(arr[5]);
            }        //always place default parent Exception catch block at last.
            catch(ArithmeticException e)
            {
                System.out.println("cannot divide by zero");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Keep your index within array size");
            }            
            catch(Exception e )
            {
                //System.out.println("All exceptions can be handled here");
                System.out.println("Exception encountered....... :" +  e);
            }
        }
}

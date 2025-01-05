
public class RunnableWithLambdaExpression {

    public static void main(String[] args) {
        System.out.println("Runnable With LambdaExpression main()");
        // Runnable obj1 = new Runnable(); error , Runnable is an interface
        Runnable obj1 = () -> {//Lambda Expression
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello...............");
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    System.out.println("Exception  :" + e);
                }
            }
        };
        Runnable obj2 = () -> {//Lambda Expression
            for (int i = 1; i <= 10; i++) {
                System.out.println("...............world");
            }
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("Exception  :" + e);
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
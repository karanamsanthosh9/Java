import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
//default imported package is java.lang
import java.util.List;
import java.util.Scanner;

public class ArrayList_example{

    public static void main(String[] args) {
        System.out.println("Main");
        arrayListDemo();
    }

    static void arrayListDemo() {
        // Collection col = new ArrayList();
        // col.add(1);
        // col.add(12);
        // col.add(412);
        // System.out.println("directly printing :" + col);
        // till here, :
        /*
         * @karanamsanthosh9 ➜ /workspaces/Java/Learnings/Java Advanced (main) $ javac
         * CollectionsDemo1.java
         * Note: CollectionsDemo1.java uses unchecked or unsafe operations.
         * Note: Recompile with -Xlint:unchecked for details.
         * 
         * output:
         * java CollectionsDemo1
         * Main
         * [1, 12, 412]
         */
       // Collection<Integer> c = new ArrayList<Integer>(); //<> - are called generics.....
       List<Integer> c = new ArrayList<>();
        c.add(122);
        c.add(123);
        c.add(124);
        System.out.println("Direct Priting  : " + c);
        for(int i : c)
        {
            System.out.println(i);
        }
        c = null;
        System.out.println("after null  : " + c); //c value coming as null
        List<Integer> v2 = new ArrayList<Integer>();

        for(int i=0; i<100; i++)
        {
            v2.add(i,(Integer) (i*i) ) ;
        }

        System.out.println(v2);
        //System.out.println(v2.indexOf(3)); it will at what index 3 is there
        System.out.print("Which square you want to know :");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        //System.out.println("square of " + index + " is " + v2.indexOf(index)); wrong
        System.out.println("square of " + index + " is " + v2.get(index)); 

        System.out.print("enter value whose sq root you want to find out  :");
        int value = sc.nextInt();
        System.out.println("square root of " + value + " is " + v2.indexOf(value));
        sc.close();

        System.out.println("Size of v2 is : "  + v2.size());
    }
}
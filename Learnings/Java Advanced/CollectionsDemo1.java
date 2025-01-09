import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;
//default imported package is java.lang

public class CollectionsDemo1 {

    public static void main(String[] args) {
        System.out.println("Main");
        arrayListDemo();
    }

    static void arrayListDemo() {
        Collection col = new ArrayList();
        col.add(1);
        col.add(12);
        col.add(412);
        System.out.println(col);
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

         
    }
}
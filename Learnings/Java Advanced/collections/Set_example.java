import java.util.Set;
import java.util.TreeSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


//set -> unique value
// and doesnot have index based getting values
//HashSet - not sorted by default
//TreeSet -> sorted set

public class Set_example {
    public static  void main(String[] args) {
        System.out.println("Main of Set_example");
        //demo1();//HashSet
        demo2();//TreeSet


    }   
    static void demo1()
    {
        Set<Integer> se = new HashSet<>();
        se.add(1);
        se.add(2);
        se.add(3);    
        System.out.println(se);// [1, 2, 3]
        se.add(3); //no error, but just ignores
       // System.out.println(se);//[1, 2, 3]

        for (int i : se) {
            System.out.println(i);
        }

    }
    static void demo2()
    {
        Set <Integer> ts = new TreeSet<>();
        System.out.println("TreeSet -> sorted Set");
        ts.add(414);
        ts.add(10);
        ts.add(4441);
        ts.add(1111);

        for(int i : ts)
        {
            System.out.println(i);
        }

        //similar to c++ iterator we can use iterator here.....
        //Collection interface implements Iterable
        //Collection
        Iterator<Integer> it = ts.iterator();
        System.out.println("using iterator");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(ts.size());
        System.out.println(ts.contains(44));
        System.out.println(ts.contains(10));

    }
}

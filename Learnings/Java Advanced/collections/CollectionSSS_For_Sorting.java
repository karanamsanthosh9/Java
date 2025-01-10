import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSSS_For_Sorting {
    public static void main(String[] args) {
        System.out.println("Main of CollectionSSS_For_Sorting");
        demo_sorting();
    }  
    
    static void demo_sorting()
    {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(3);
        System.out.println("before sorting");
        for(int i: list)
            System.out.print(i + " ");
        Collections.sort(list);/*this is not Collection(interface), but Collections(class) */
        System.out.println();
        System.out.println("after sorting");
        for(int i :list)
            System.out.print(i+ " ");
        
    }
}



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//key is unique, its value can be updated
public class Map_example {

    public static void main(String[] args) {
        System.out.println("Main of Map_example");
        demo1();
    }    

    static void demo1()
    {
        Map<String,Integer> hikes = new HashMap<>();
        hikes.put("Mr",10);
        hikes.put("Nv",5);
        hikes.put("sn",1000);

        System.out.println(hikes);

        System.out.println("Hike for sn is :" + hikes.get("sn"));
        System.out.println("global demand surge");
        hikes.put("Nv", 10);
        System.out.println("Nv hike post global demand surge is : " + hikes.get("Nv"));

        System.out.println(hikes.containsKey("Nv"));
        System.out.println(hikes.containsKey("Kir"));
        System.out.println(hikes.keySet()); //lists all keys

        hikes.putIfAbsent("Wa", 199);
        
        for(String name : hikes.keySet())
        {
            System.out.println(name + " : " + hikes.get(name));
        }
    }
    static void demo2()
    {

    }
    
}

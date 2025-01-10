

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


//key is unique, its value can be updated
public class Map_example {

    public static void main(String[] args) {
        System.out.println("Main of Map_example");
        demo1();
        demo2();
    }    

    static void demo1()
    {
        Map<String,Integer> hikes = new HashMap<>();//use Hashtable for synchronized if using multiple threads
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

        Map<String,Integer> newMap = new HashMap<>();
        //newMap = hikes.putAll(newMap);
        //hikes.putAll(newMap);

        newMap.putAll(hikes); //putall from hikes to newMap.....
        
        for(String emp : newMap.keySet())
        {
            System.out.println("For  " + emp + " hike is " + newMap.get(emp));
        } 
    }
    static void demo2()
    {
        //using Hashtable instead of Hashmap
        Map<String, Integer> ht = new Hashtable<>();
        ht.put("N", 1);
        ht.put("S", 9);
        ht.put("G", 100);

        for(String str : ht.keySet())
        {
            System.out.println(str  + " : " + ht.get(str));
        }

        Map<String, Integer> typeCheck =  new HashMap<>();

        typeCheck.putAll(ht);

        System.out.println("typecheck");
        
        for(String str : typeCheck.keySet())
        {
            System.out.println(str  + " : " + typeCheck.get(str));
        }
    }
    
}

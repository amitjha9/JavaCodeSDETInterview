package CodeCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapInJava {


    public void getKey()
    {
        Map<String,Integer> map = new HashMap<>();
        map.put("Amit",1);
        map.put("Gudiya",2);
        map.put("Aadvik",3);

        //Traverse the map
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String,Integer> data = iterator.next();
            System.out.println("Key:" +data.getKey());
        }
    }

    public void getValue()
    {
        Map<String,Integer> map = new HashMap<>();
        map.put("Amit",1);
        map.put("Gudiya",2);
        map.put("Aadvik",3);

        //Traverse the map
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String,Integer> data = iterator.next();
            System.out.println("Value:" +data.getValue());
        }
    }


    public void printMapUsingForEachLoop()
    {
        Map<String,Integer> map = new HashMap<>();
        map.put("Amit",1);
        map.put("Gudiya",2);
        map.put("Aadvik",3);

        //Traverse the map
        for (Map.Entry<String,Integer> dataValue: map.entrySet()) {
            System.out.println("Key:" +dataValue.getKey() + " Value:" +dataValue.getValue());
        }
    }


    public void printKeyOnlyUsingForEachLoop()
    {
        Map<String,Integer> map = new HashMap<>();
        map.put("Amit",1);
        map.put("Gudiya",2);
        map.put("Aadvik",3);

        for (Map.Entry<String,Integer> dataKey : map.entrySet()) {
            System.out.println("Key:" +dataKey.getKey());
        }
    }

    public static void main(String[] args)
    {
        HashMapInJava hashMapInJava = new HashMapInJava();
        hashMapInJava.getKey();
        hashMapInJava.getValue();
        hashMapInJava.printMapUsingForEachLoop();
        hashMapInJava.printKeyOnlyUsingForEachLoop();
    }
}

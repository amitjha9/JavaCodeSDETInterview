package CodeCollections;

import java.util.*;

public class PrintSortedMapKey {

    public void getSolution()
    {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(10, "Apple");
        hashMap.put(5, "Mango");
        hashMap.put(20, "Orange");
        hashMap.put(18, "Guava");
        hashMap.put(25, "Coconut");

        List<Map.Entry<Integer,String>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey()-o2.getKey();
            }
        });

        //Print the map
        for (Map.Entry<Integer,String> dataValue: list
             ) {
            System.out.println("Key:" +dataValue.getKey());
        }
    }

    public static void main(String[] args)
    {
        PrintSortedMapKey printSortedMapKey = new PrintSortedMapKey();
        printSortedMapKey.getSolution();
    }
}

package CodeCollections;

import java.util.*;

public class PrintSortedMapValue {

    public void getSolution()
    {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Apple", 10);
        hashMap.put("Mango", 5);
        hashMap.put("Orange", 15);
        hashMap.put("Guava", 2);
        hashMap.put("Coconut", 20);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });

        //Traverse and print the map
        System.out.println("Map after sorting the value");
        for (Map.Entry<String,Integer> dataValue: list
             ) {
            System.out.println("Value:" +dataValue.getValue());
        }
    }

    public static void main(String[] args)
    {
        PrintSortedMapValue printSortedMap = new PrintSortedMapValue();
        printSortedMap.getSolution();
    }
}

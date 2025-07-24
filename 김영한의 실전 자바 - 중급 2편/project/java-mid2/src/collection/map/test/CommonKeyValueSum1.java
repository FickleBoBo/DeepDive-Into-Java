package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Set<String> set1 = map1.keySet();
        Set<String> set2 = map2.keySet();

        set1.retainAll(set2);

        Map<String, Integer> map3 = new HashMap<>();

        for (String key : set1) {
            map3.put(key, map1.get(key) + map2.get(key));
        }
        System.out.println(map3);
    }
}

package A11CollNgenerics.Lecture.Maps;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Keshav", 100);
        map.put("Tanuja", 100);
        map.put("Sanchit", 100);
        map.put("Raghav", 100);
        System.out.println(map.size());
        System.out.println(map.get("Keshav"));
        System.out.println(map.containsKey("Keshav"));
        System.out.println(map.containsKey("Sapna"));
        System.out.println(map.remove("Raghav"));//returns value associated with the key
        System.out.println(map.size());
        System.out.println();
        for (String key : map.keySet()) {//Travesersing in the map
            System.out.printf("%s : %s \n",key,map.get(key));
        }
    }
}

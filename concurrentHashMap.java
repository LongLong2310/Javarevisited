import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashmap {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        map.put("1","2");
        map.put("2","2");
        map.put("3","2");
        map.put("4","2");
        map.put("5","2");
        map.put("6","2");

        System.out.println("Result of ConcurrentHashmap before iterating: " + map);
        Iterator<String> it = map.keySet().iterator();

        while (it.hasNext()){
            String key = it.next();
            if (key.equals("3")) map.put("new", "new");
        }

        System.out.println("Result of ConcurrentHashmap after iterating: " + map);

        HashMap<String, String> map1 = new HashMap<>();

        map1.put("1","2");
        map1.put("2","2");
        map1.put("3","2");
        map1.put("4","2");
        map1.put("5","2");
        map1.put("6","2");

        System.out.println("Result of Hashmap before iterating: " + map1);

        Iterator<String> it1 = map1.keySet().iterator();

        while (it1.hasNext()){
            String key = it1.next();
            if (key.equals("3")) {
                map1.put("new", "new");
                break;
            }
        }

        System.out.println("Result of Hashmap after iterating: " + map1);
    }
}

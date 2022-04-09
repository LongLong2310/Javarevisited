import java.util.HashMap;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        HashMap<String, Integer> student = new HashMap<>();
        student.put(null, null);

        System.out.println("HashMap: " + student);

        TreeMap<String, Integer> student1 = new TreeMap<>();
        student1.put("Long", null);

        System.out.println("TreeMap: " + student1);

    }
}

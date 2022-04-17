import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class linkedHashMap {
        public static void main(String[] args) {
            HashMap<String, Integer>  student = new HashMap<>();
            student.put("John", 243);
            student.put("Anna", 253);
            student.put("Hank", 283);
            student.put("Bill", 267);

            System.out.println("HashMap: " + student);

            TreeMap<String, Integer> student1 = new TreeMap<>();
            student1.put("John", 243);
            student1.put("Anna", 253);
            student1.put("Hank", 283);
            student1.put("Bill", 267);

            System.out.println("TreeMap: " + student1);

            LinkedHashMap<String, Integer> student2 = new LinkedHashMap<>();
            student2.put("John", 243);
            student2.put("Anna", 253);
            student2.put("Hank", 283);
            student2.put("Bill", 267);

            System.out.println("LinkedHashMap: " + student2);

        }

}

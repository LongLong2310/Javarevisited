import java.util.HashMap;

public class hashMap {
    public static void main (String[] args){
        HashMap<String, Integer> student = new HashMap();

        student.put("John", 243);
        student.put("Anna", 253);
        student.put("Jack", 283);

        student.put("Jim", 342);

        student.replace("Jim", 832);

        student.remove("Anna");
        System.out.print(student);

    }


}

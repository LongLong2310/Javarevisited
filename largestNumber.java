import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

class largestNumber {
    private static void LargestNumber(Vector<String> arr){
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String A, String B) {
                String AB = A + B;

                String BA = B + A;

                return AB.compareTo(BA) > 0 ? -1 : 1;
            }
        });

        Iterator it = arr.iterator();

        while (it.hasNext())
            System.out.print(it.next());
    }

    //Driver code
    public static void main (String[] args){
        Vector<String> array = new Vector<>();

        array.add("54");
        array.add("546");
        array.add("548");
        array.add("60");

        System.out.print("The largest number formed from an arary: ");

        LargestNumber(array);
    }
}

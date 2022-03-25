import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class isomorphicString
{
    private static boolean checkIsomorphic(String str1, String str2){
        if (str1.length() != str2.length())
            return false;

        HashMap<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str1.length(); i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (!map.containsKey(c1)){
                if (set.contains(c2))
                    return false;

                map.put(c1,c2);
                set.add(c2);
            }

            else
                if (map.get(c1) != c2)
                    return false;
        }
        return true;
    }

    public static void main(String[] args){
        String str1 = "EGG";
        String str2 = "ADD";

        if (checkIsomorphic(str1,str2))
            System.out.println("Two strings are isomorphic");
        else
            System.out.println("Two strings are not isomorphic");
    }
}

import java.util.HashSet;
import java.util.Scanner;

public class firstRepeated {
    public static void main(String[] args){
        Scanner inputString = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = inputString.nextLine();
        if (FirstRepeated(string) == '\0') {
            System.out.println("There is no repeated character in String");
        }
        else
            System.out.println("First repeated character in String is: " + FirstRepeated(string));
    }

    private static char FirstRepeated(String s){
        //Convert to array
        char[] arr = s.toCharArray();

        //Create a Hashset
        HashSet<Character> h = new HashSet<>();


        for (int i = 0; i < arr.length - 1; i++){
            if (h.contains(arr[i])){
                return arr[i];
            }
            else
                h.add(arr[i]);
        }
        return '\0';
    }
}

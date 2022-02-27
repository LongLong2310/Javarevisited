import java.util.Scanner;

public class reverseString {
    public static void main(String[] args){
        Scanner inputString = new Scanner(System.in);

        String s;

        System.out.print("Enter a String: ");
        s = inputString.nextLine();
        ReverseString(s);
    }

    private static void ReverseString(String s){
        char[] result = s.toCharArray();

        for (int i = result.length - 1; i >= 0; i--){
            System.out.print(result[i]);
        }
    }
}

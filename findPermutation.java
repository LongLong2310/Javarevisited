import java.util.Scanner;

public class findPermutation {
    public static void main(String[] args){
        Scanner inputString = new Scanner(System.in);

        String s;
        String result = "";

        System.out.print("Enter a String: ");
        s = inputString.nextLine();
        System.out.println("All permutation of this string: ");
        Permutation(s,result);
    }

    private static void Permutation(String string, String answer){
        if (string.length() == 0){
            System.out.print(answer + " ");
            return;
        }

        for (int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            String left_subString = string.substring(0,i);
            String right_subString = string.substring(i+1);
            String rest = left_subString + right_subString;
            Permutation(rest, answer + c);
        }
    }
}



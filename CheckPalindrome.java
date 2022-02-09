import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {

        Scanner inputString = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = inputString.nextLine();

        if(checkPalindrome(string))
            System.out.println(string + " is palindrome.");
        else
            System.out.println(string + " is not palindrome.");

    }

    private static boolean checkPalindrome(String string){

        //Convert a string to lower case letter
        string = string.toLowerCase();

        //Remove space in string
        string = string.replaceAll("\\s", "");

        int i = 0;
        int j = string.length() - 1;

        while (i < j){
            if (string.charAt(i) != string.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

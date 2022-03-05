import java.util.Scanner;

public class lastWordLength {
    public static int lengthOfLastWord(String a)
    {
        boolean char_flag = false;
        int count = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (Character.isLetter(a.charAt(i))) {
                // Once the first character from last
                // is encountered, set char_flag to true.
                char_flag = true;
                count++;
            }
            else {
                // When the first space after the characters
                // (from the last) is encountered, return the
                // length of the last word
                if (char_flag == true)
                    return count;
            }
        }
        return count;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner inputString = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String s = inputString.nextLine();

        System.out.println("The length of last word is " + lengthOfLastWord(s));
    }
}


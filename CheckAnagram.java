import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args){
        Scanner inputString = new Scanner(System.in);
        System.out.print("Enter 2 strings to check: ");

        //Input 2 Strings
        String string1 = inputString.nextLine();
        String string2 = inputString.nextLine();

        //Call the function
        if(checkAnagram(string1,string2))
            System.out.println(string1 + " " + string2 + " are anagrams.");
        else
            System.out.println(string1 + " " + string2 + " are not anagrams.");
    }

    private static boolean checkAnagram(String s1, String s2) {
        //Remove space in String
        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");

        //If length of 2 strings are different
        if (s1.length() != s2.length()) {
            return false;
        }

        //set all of the letters in both string to lower case and convert into array
        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();

        //Sort the array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //Return true if they the same. Otherwise return false
        return Arrays.equals(arr1, arr2);
    }
}

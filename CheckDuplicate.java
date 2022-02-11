import java.util.Scanner;

public class CheckDuplicate {
    public static void main(String[] args){
        Scanner inputString = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = inputString.nextLine();
        char[] array = string.toCharArray();
        checkDuplicate(array);
    }

    private static void checkDuplicate(char[] array){
        boolean flag = true;
        char[] result = new char[0];

        for(int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
                    flag = false;
                    result = addArr(result, array[i]);
                }
            }
        }

        if (!flag) {
            System.out.print("The array contains duplicated character: ");
            for (int i = 0; i < result.length; i++){
                if (i == 0) {
                    System.out.print(result[i]);
                    continue;
                }
                System.out.print(", " + result[i]);
            }
        }
        else System.out.print("The array doesn't contain any duplicated character");
    }

    private static char[] addArr(char[] arr, char c){
        int n = arr.length;
        char[] newArr = new char[n + 1];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[n] = c;
        return newArr;
    }
}

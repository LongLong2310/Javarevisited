import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args){
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter a positive number to check: ");
        int num = inputNum.nextInt();

        if(checkPrime(num))
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    private static boolean checkPrime(int number){
        for (int i = 2; i <= number/2; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}


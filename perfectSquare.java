import java.util.Scanner;

class perfectSquare {

    private static boolean isPerfectSquare(int x)
    {
        if (x >= 0) {

            // Find floating point value of
            // square root of x.
            int sr = (int)Math.sqrt(x);

            // if product of square root
            // is equal, then
            // return T/F

            return ((sr * sr) == x);
        }
        return false;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check Perfect Square: ");
        int num = input.nextInt();

        if (isPerfectSquare(num))
            System.out.print(num + " is a Perfect Square");
        else
            System.out.print(num + " is not a Perfect Square");
    }
}





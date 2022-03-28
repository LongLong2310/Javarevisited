import java.util.Scanner;

class integerToRoman {
    private static String convert(int num){
        String[] m = { "", "M", "MM", "MMM"};
        String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] x = {"","X", "XX", "XXX", "XL", "L","LX", "LXX", "LXXX", "XC"};
        String[] i = {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String thousand = m[num/1000];
        String hundred = c[(num%1000) / 100];
        String tens = x[(num % 100) / 10];
        String ones = i[(num % 10)];

        String result = thousand + hundred + tens + ones;

        return result;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to convert into Roman: ");
        int num = input.nextInt();
        System.out.println("Result: " + convert(num));
    }
}


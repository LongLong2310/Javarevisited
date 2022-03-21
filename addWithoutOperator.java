import java.util.Scanner;

class addWithoutOperator
{
    private static int Add(int num1, int num2){
        int XOR = num1 ^ num2;
        int Carry = num1 & num2;

        if (Carry == 0){
            return XOR;
        }

        else
            return Add(XOR, Carry << 1);
    }

    public static void main (String[] args){
        System.out.println("Sum of 6 and 5: " + Add(5,6));
    }
}



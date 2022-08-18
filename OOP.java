public class OOP {
    public static void main(String[] args) {
        OOP sum = new OOP();

        System.out.println("Sum of 5 and 10 is " + sum.Sum(5,10));

        System.out.println("Sum of 5 and 10 and 2 is " + sum.Sum(5,10,2));

        System.out.println("Sum of 5.5 and 8.9 is " + sum.Sum(5.5,8.9));
    }

    public int Sum(int x, int y){
        return x+y;
    }

    public int Sum(int x, int y, int z){
        return x + y + z;
    }

    public double Sum(double x, double y){
        return x + y;
    }

}

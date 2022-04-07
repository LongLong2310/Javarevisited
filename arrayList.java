import java.util.ArrayList;

public class arrayList {
    public static void main (String[] args){
        ArrayList<String> food = new ArrayList<>();

        food.add("Sushi");
        food.add("Pizza");
        food.add("Noodle");

        food.set(2, "Ramen");

        food.remove("Pizza");

        food.clear();

        System.out.print(food);
    }
}

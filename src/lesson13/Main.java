package lesson13;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> fridge = new HashMap<>();
        fridge.put("Water", 10);
        fridge.put("Sugar", 5);
        fridge.put("Sliva", 2);

        System.out.println(fridge);
    }
}

package be.intecbrussel.opdrachten.opdrachtMap;

import java.util.*;

public class MapApp {

    public static void main(String[] args) {

        Map<String, Integer> ingredient = new HashMap<>();
        ingredient.put("Potato", 5);  //(key, value)
        ingredient.put("Tomato", 15);  //(key, value)
        ingredient.put("Sugar", 3000);  //(key, value)
        ingredient.put("Banana", 3);  //(key, value)

        Integer sugarAmount = ingredient.get("Sugar");
        System.out.println(sugarAmount);
    }
}

package be.intecbrussel.opdrachten.opdrachtMap;

import java.util.*;

public class MapApp {

    public static void main(String[] args) {

        NavigableMap<String, Integer> ingredient = new TreeMap<>();
        ingredient.put("Potato", 5);  //(key, value)
        ingredient.put("Tomato", 15);  //(key, value)
        ingredient.put("Mayonaise", 300);  //(key, value)
        ingredient.put("Sugar", 3000);  //(key, value)
        ingredient.put("Banana", 3);  //(key, value)

        Integer sugarAmount = ingredient.get("Sugar");
        System.out.println(sugarAmount);
        System.out.println("-----");
        ingredient.values().forEach(System.out::println);
        System.out.println("-----");
        ingredient.keySet().forEach(System.out::println);

        String firstKey = ingredient.firstKey(); //alfabetische volgorde
        String lastKey = ingredient.lastKey(); //alfabetische volgorde
        String floorKey = ingredient.floorKey("Pepper"); //laatste woord voor Pepper
        String ceilingKey = ingredient.ceilingKey("Pepper"); //eerste woord na Pepper
        System.out.println("-----");
        System.out.println(firstKey);
        System.out.println(lastKey);
        System.out.println(floorKey);
        System.out.println(ceilingKey);
    }
}

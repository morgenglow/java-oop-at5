package ru.geekbrains.example.hashmap;

import ru.geekbrains.example.hashmap.Dog;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    @Test
    public void add() {
        Dog spike = new Dog("Спайк", 1122233);
        Dog tom = new Dog("Tom", 444555);
        Dog lord = new Dog("Лорд", 555777);

        Map<String, Dog> mapStingDog = new HashMap<>();
        mapStingDog.put("Вася", spike);
        mapStingDog.put("Петя", tom);
        mapStingDog.put("Настя", lord);
        mapStingDog.put("Ольга", lord);

        System.out.println(mapStingDog);
    }

    @Test
    public void get() {
        Dog spike = new Dog("Спайк", 1122233);
        Dog tom = new Dog("Tom", 444555);
        Dog lord = new Dog("Лорд", 555777);

        Map<String, Dog> mapStingDog = new HashMap<>();
        mapStingDog.put("Вася", spike);
        mapStingDog.put("Петя", tom);
        mapStingDog.put("Настя", lord);
        mapStingDog.put("Ольга", lord);

        System.out.println(mapStingDog.get("Настя"));
    }

    @Test
    public void getKeys() {
        Dog spike = new Dog("Спайк", 1122233);
        Dog tom = new Dog("Tom", 444555);
        Dog lord = new Dog("Лорд", 555777);

        Map<String, Dog> mapStingDog = new HashMap<>();
        mapStingDog.put("Вася", spike);
        mapStingDog.put("Петя", tom);
        mapStingDog.put("Настя", lord);
        mapStingDog.put("Ольга", lord);

        System.out.println(mapStingDog.keySet());
    }
    @Test
    public void getValues() {
        Dog spike = new Dog("Спайк", 1122233);
        Dog tom = new Dog("Tom", 444555);
        Dog lord = new Dog("Лорд", 555777);

        Map<String, Dog> mapStingDog = new HashMap<>();
        mapStingDog.put("Вася", spike);
        mapStingDog.put("Петя", tom);
        mapStingDog.put("Настя", lord);
        mapStingDog.put("Ольга", lord);

        System.out.println(mapStingDog.values());
    }
}
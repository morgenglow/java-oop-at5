package ru.geekbrains.example.hashset;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {


    @Test
    public void add() {
        Dog tom = new Dog("Tom", 444555);

        HashSet<Dog> dogSet = new HashSet<>();

        dogSet.add(tom);
        dogSet.add(
                new Dog("Tom", 444555)
        );

        System.out.println(dogSet);
    }

    @Test
    public void size() {
        Dog tom = new Dog("Tom", 444555);

        HashSet<Dog> dogSet = new HashSet<>();
        dogSet.add(tom);

        System.out.println(dogSet.size());
    }


    @Test
    public void getInMap() {
        Dog spike = new Dog("Спайк", 1122233);
        Dog tom = new Dog("Tom", 444555);
        Dog lord = new Dog("Лорд", 555777);

        Set<Dog> dogSet = new HashSet<>();
        dogSet.add(spike);
        dogSet.add(tom);
        dogSet.add(lord);

        System.out.println(dogSet);

        List<Dog> list = new ArrayList<>(dogSet);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}

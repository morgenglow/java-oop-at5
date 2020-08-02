package ru.geekbrains.example.Collections;

import ru.geekbrains.example.array.ArrayExample.Dog;

import java.util.ArrayList;
import java.util.List;

public class CollectionsMethodExample {
    public static void main(String[] args) {
        Dog spike = new Dog("Спайк", 11223344);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(
                new Dog("Том", 11223344)
        );

        System.out.println(dogList);
    }

}
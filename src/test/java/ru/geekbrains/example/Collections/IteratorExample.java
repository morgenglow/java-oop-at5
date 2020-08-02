package ru.geekbrains.example.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        Dog spike = new Dog("Спайк", 11223344);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(
                new Dog("Том", 11223344)
        );

        Iterator<Dog> iterator = dogList.iterator();

        while (iterator.hasNext()){
            iterator.remove();
        }

    }
}

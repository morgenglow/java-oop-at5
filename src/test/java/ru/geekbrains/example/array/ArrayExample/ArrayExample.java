package ru.geekbrains.example.array.ArrayExample;


import ru.geekbrains.example.array.ArrayExample.Dog;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayExample {

    //    list имеет 2 метода add() и add (index),
//    если добавить несколько элементов методом add(),
//    а затем добавить add(0), то лист увеличится а значения сместятся и по get(index)
//    получим другие значения 
    @Test
    public void add() {
        Dog spike = new Dog("Спайк", 1122233);
        Dog tom = new Dog("Tom", 444555);
        Dog lord = new Dog("Лорд", 555777);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(1,lord);

        System.out.println(dogList);
    }


    @Test
    public void indexOf() {
        Dog spike = new Dog("Спайк", 1122233);
        Dog tom = new Dog("Tom", 444555);
        Dog lord = new Dog("Лорд", 555777);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(lord);

        System.out.println(dogList.indexOf(tom));
    }


    @Test
    public void contains() {
        Dog spike = new Dog("Спайк", 1122233);
        Dog tom = new Dog("Tom", 444555);
        Dog lord = new Dog("Лорд", 555777);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(lord);

        System.out.println(dogList.contains(tom));
    }


    @Test
    public void remove() {
        Dog spike = new Dog("Спайк", 1122233);
        Dog tom = new Dog("Tom", 444555);
        Dog lord = new Dog("Лорд", 555777);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(lord);

        System.out.println(dogList);
        System.out.println(dogList.remove(tom));
        System.out.println(tom);
        System.out.println(dogList);
    }

    @Test
    public void set() {
        Dog spike = new Dog("Спайк", 1122233);
        Dog tom = new Dog("Tom", 444555);
        Dog lord = new Dog("Лорд", 555777);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(lord);


        Dog bubbles = new Dog("Шарик", 888999);
        System.out.println(dogList);
        dogList.set(2,bubbles);
        System.out.println(dogList);
    }

    @Test
    public void clear() {
        Dog spike = new Dog("Спайк", 1122233);
        Dog tom = new Dog("Tom", 444555);
        Dog lord = new Dog("Лорд", 555777);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(lord);

        System.out.println(dogList);
        dogList.clear();
        System.out.println(dogList);

        System.out.println(spike);
        System.out.println(tom);
        System.out.println(lord);
    }

    @Test
    public void toArray() {
        Dog spike = new Dog("Спайк", 1122233);
        Dog tom = new Dog("Tom", 444555);
        Dog lord = new Dog("Лорд", 555777);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(lord);

        Object[] objects = dogList.toArray();
    }

    @Test
    public void addAll() {
        Dog spike = new Dog("Спайк", 1122233);
        Dog tom = new Dog("Tom", 444555);
        Dog lord = new Dog("Лорд", 555777);

        List<Dog> dogList1 = new ArrayList<>();
        dogList1.add(spike);

        List<Dog> dogList2 = new ArrayList<>();
        dogList2.add(tom);
        dogList2.add(lord);

        dogList1.addAll(dogList2);

        System.out.println(dogList1);
    }

    @Test
    public void listIterator() {
        Dog spike = new Dog("Спайк", 1122233);
        Dog tom = new Dog("Tom", 444555);
        Dog lord = new Dog("Лорд", 555777);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(lord);

        ListIterator<Dog> dogListIterator = dogList.listIterator();

        System.out.println("вниз");
        while (dogListIterator.hasNext()){
            System.out.println(dogListIterator.next());
        }

        System.out.println("вверх");
        while (dogListIterator.hasPrevious()){
            System.out.println(dogListIterator.previous());
        }
    }

}
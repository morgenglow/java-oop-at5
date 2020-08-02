package ru.geekbrains.java.oop.at;

import java.util.*;

public class WordsSet {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Андрей");
        names.add("Валерий");
        names.add("Георгий");
        names.add("Степан");
        names.add("Иван");
        names.add("Геропокл");
        names.add("Евклид");
        names.add("Елисей");
        names.add("Евдоким");
        names.add("Панкрат");
        names.add("Ефим");
        names.add("Михаил");
        names.add("Джон");
        names.add("Георгий");
        names.add("Евклид");
        names.add("Геропокл");
        names.add("Георгий");
        names.add("Дмитрий");
        names.add("Сергей");
        names.add("Александр");

        System.out.println("Вся коллекция имен составляет: "+names+"\n");

        Set<String> stringSet = new LinkedHashSet<>(names);
        System.out.println("Уникальные имена это: "+stringSet+"\n");

        HashMap<String, Integer> doubleNames = new HashMap<>();
        Integer doubleName;
        for (String i : names) {

            doubleName = doubleNames.get(i);
            doubleNames.put(i, doubleName == null ? 1 : doubleName + 1);
        }

        System.out.println(doubleNames);
    }
}

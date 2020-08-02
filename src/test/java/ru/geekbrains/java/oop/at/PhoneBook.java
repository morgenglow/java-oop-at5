package ru.geekbrains.java.oop.at;

import java.util.HashMap;
import java.util.HashSet;

class MainPhoneBook {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Bob", 4564587, 0, 0);
        phoneBook.add("Mike", 12547896, 12365478, 98563214);
        phoneBook.add("Billy", 12345678, 78953000, 45698521);

        System.out.println(phoneBook.phoneBook1);
        phoneBook.get("Mike");

    }
}

class PhoneBook {

    HashMap<String, HashSet<Integer>> phoneBook1;

    PhoneBook() {
        this.phoneBook1 = new HashMap<>();
    }

    void add(String name, int num1, int num2, int num3) {
        HashSet<Integer> phoneBook = phoneBook1.getOrDefault(name, new HashSet<>());
        phoneBook.add(num1);
        phoneBook.add(num2);
        phoneBook.add(num3);

        phoneBook1.put(name, phoneBook);
    }

    void get(String name) {

        System.out.println("Контакт "+name+": "+ phoneBook1.getOrDefault(name, new HashSet<>()));
    }
}
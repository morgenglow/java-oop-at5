package ru.geekbrains.example.Equals1;

import org.junit.jupiter.api.Assertions;

public class EqualsExample {
    public static void main(String[] args) {
        Dog spike = new Dog("Спайк");
        Dog lord = spike;

        Assertions.assertTrue(spike.equals(lord));


        Dog tony = new Dog("Тони");
        Dog tonyMotnata = new Dog("Тони");

        Assertions.assertTrue(tony.equals(tonyMotnata));
    }

}